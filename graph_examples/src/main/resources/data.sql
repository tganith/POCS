INSERT INTO Department (id,deptname,location) VALUES (100001, 'Technology', 'Bangalore');
INSERT INTO Department (id,deptname,location) VALUES (100002, 'Accounts', 'Chennai');
INSERT INTO Department (id,deptname,location) VALUES (100003, 'Administration', 'Mumbai');
INSERT INTO Department (id,deptname,location) VALUES (100004, 'Auditing', 'Mumbai');
INSERT INTO Department (id,deptname,location) VALUES (100005, 'Vendor Management', 'Hyderabad');

INSERT INTO Employee (id, name, age, mobilenumber,role, deptid) VALUES (100, 'Ganitha', 25,'1234567890','Software Engineer',100001);
INSERT INTO Employee (id, name, age, mobilenumber,role, deptid) VALUES (101, 'Vijay', 34,'1234567891','Test Engineer',100001);
INSERT INTO Employee (id, name, age, mobilenumber,role, deptid) VALUES (102, 'Suraj', 23,'1234567897','Developer',100001);
INSERT INTO Employee (id, name, age, mobilenumber,role, deptid) VALUES (103, 'Krishna', 25,'1234567891','Test Engineer',100001);


INSERT INTO Employee (id, name, age, mobilenumber,role, deptid) VALUES (200, 'pattabhi', 25,'1244567890','Accounts Manager',100002);
INSERT INTO Employee (id, name, age, mobilenumber,role, deptid) VALUES (201, 'Vijay krishna', 25,'1244567891','Accounts Manager',100002);

INSERT INTO Employee (id, name, age, mobilenumber,role, deptid) VALUES (301, 'kamal', 25,'1534567892','Manager',100003);
INSERT INTO Employee (id, name, age, mobilenumber,role, deptid) VALUES (302, 'John', 25,'1634567892','Sr Manager',100003);

INSERT INTO Employee (id, name, age, mobilenumber,role, deptid) VALUES (401, 'chandra', 25,'1734567892','Auditing Manager',100004);
INSERT INTO Employee (id, name, age, mobilenumber,role, deptid) VALUES (402, 'rajani', 25,'1834567892','Review Manager',100004);

INSERT INTO Employee (id, name, age, mobilenumber,role, deptid) VALUES (501, 'Modi', 25,'1934567892','Vendor Manager',100005);
INSERT INTO Employee (id, name, age, mobilenumber,role, deptid) VALUES (502, 'Jagan', 25,'1294567892','Sr Vendor Manager',100005);