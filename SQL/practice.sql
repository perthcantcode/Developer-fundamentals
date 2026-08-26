CREATE DATABASE IF NOT EXISTS school_db;

USE school_db;

DROP DATABASE IF EXISTS test_db;

CREATE TABLE  students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    age INT
);

DESCRIBE students;

ALTER TABLE students ADD COLUMN email VARCHAR(100);

DROP TABLE IF EXISTS temporary_table;

INSERT INTO students (first_name, last_name, age, email) 
VALUES ('Alice', 'Smith', 20, 'alice@example.com');

INSERT INTO students (first_name, last_name, age, email) VALUES 
('Bob', 'Jones', 22, 'bob@example.com'),
('Charlie', 'Brown', 19, 'charlie@example.com');

SELECT * FROM students;

SELECT first_name, email FROM students;

SELECT * FROM students WHERE age > 20;

SELECT * FROM students WHERE age >= 20 AND first_name = 'Alice';

SELECT * FROM  students ORDER BY age DESC;

SELECT * FROM students LIMIT 2;

