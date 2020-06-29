package com.mypoc.graphsql.employeeservice.service;

import com.mypoc.graphsql.employeeservice.datafetcher.AllEmployeeDataFetcher;
import com.mypoc.graphsql.employeeservice.datafetcher.DepartmentDataFetcher;
import com.mypoc.graphsql.employeeservice.datafetcher.EmployeeDataFetcher;
import com.mypoc.graphsql.employeeservice.repository.EmployeeRepository;
import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.SchemaParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;

import graphql.schema.idl.TypeDefinitionRegistry;
import graphql.schema.idl.*;

@Component
public class EmployeeService {

    @Autowired
    EmployeeRepository repository;

    @Value("classpath:employee.graphqls")
    Resource resource;

    private GraphQL graphQL;

    @Autowired
    private AllEmployeeDataFetcher allEmployeeDataFetcher;

    @Autowired
    private EmployeeDataFetcher empByIdDataFetcher;

    @Autowired
    private DepartmentDataFetcher deptByIdDataFetcher;

    @PostConstruct
    private void loadSchema() throws IOException {
        File schemaFile = resource.getFile();
        TypeDefinitionRegistry typeRegistry = new SchemaParser().parse(schemaFile);
        RuntimeWiring wiring = buildRuntimeWiring();
        GraphQLSchema schema = new SchemaGenerator().makeExecutableSchema(typeRegistry, wiring);
        graphQL = GraphQL.newGraphQL(schema).build();
    }


    private RuntimeWiring buildRuntimeWiring() {
        return RuntimeWiring.newRuntimeWiring()
                .type("Query", typeWiring -> typeWiring
                        .dataFetcher("allEmployee", allEmployeeDataFetcher))
                .type("Query", typeWiring -> typeWiring
                        .dataFetcher("empById", empByIdDataFetcher))
                .type("Query", typeWiring -> typeWiring
                        .dataFetcher("deptById", deptByIdDataFetcher))
                .build();
    }

    public GraphQL getGraphQL() {
        return graphQL;
    }
}
