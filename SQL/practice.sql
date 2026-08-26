CREATE DATABASE school_db;

USE school_db;

DROP DATABASE IF EXISTS test_db;

CREATE TABLE  students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(50),
    last_name(50),
    age INT
);

DESCRIBE students;
