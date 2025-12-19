DROP DATABASE IF EXISTS cruddb;
CREATE DATABASE cruddb;

\c cruddb;

DROP TABLE IF EXISTS student;
CREATE TABLE student(
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(50) NOT NULL,
    mobile VARCHAR(10) NOT NULL
);

INSERT INTO student(name,email,mobile) VALUES('Meet Shah','meet@shah.com','1234567890');
INSERT INTO student(name,email,mobile) VALUES('Raj Jain','raj@jain.com','1266467890');
INSERT INTO student(name,email,mobile) VALUES('Smit Shah','smit@shah.com','1567567890');

SELECT * FROM student;