package com.mypoc.swaggerexamples.swagger_examples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@SpringBootApplication
public class SwaggerExamplesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerExamplesApplication.class, args);

		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String password = "testpassword";
		String encodedPassword = passwordEncoder.encode(password);
		System.out.println();
		System.out.println("Password is         : " + password);
		System.out.println("Encoded Password is : " + encodedPassword);

		System.out.println("Decoded Password is : " + encodedPassword);
	}




}
