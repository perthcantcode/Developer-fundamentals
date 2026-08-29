-- creates a new empty database.
CREATE DATABASE company_db;

-- 2. CREATE TABLE & CONSTRAINTS
-- Creates tables with defined structures and rules (PRIMARY KEY, NOT NULL).
CREATE TABLE departments (
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR(50) NOT NULL
);

CREATE TABLE employees (
    emp_id INT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    hire_date DATE,
    salary DECIMAL(10, 2),
    dept_id INT,
    -- 3. FOREIGN KEY CONSTRAINT
    -- Links this table to the 'departments' table.
    FOREIGN KEY (dept_id) REFERENCES departments(dept_id)
);

-- 4. INSERT DATA
-- Adds new rows of data into the tables.
INSERT INTO departments (dept_id, dept_name) 
VALUES 
    (1, 'Engineering'),
    (2, 'Marketing'),
    (3, 'HR');

INSERT INTO employees (emp_id, first_name, last_name, hire_date, salary, dept_id) 
VALUES 
    (101, 'Alice', 'Smith', '2022-01-15', 85000.00, 1),
    (102, 'Bob', 'Johnson', '2021-03-10', 78000.50, 1),
    (103, 'Charlie', 'Brown', '2023-06-01', 65000.00, 2),
    (104, 'Diana', 'Prince', '2020-11-20', 92000.00, 3);

    -- 5. BASIC SELECT
-- Retrieves specific columns (or all columns using *) from a table.
SELECT * FROM employees;

-- 6. ALIASING (AS)
-- Gives a column or table a temporary, readable name for the output.
SELECT first_name AS "First Name", last_name AS "Last Name" 
FROM employees;

-- 7. FILTERING DATA (WHERE)
-- Retrieves only the rows that meet a specific condition.
SELECT first_name, salary 
FROM employees 
WHERE salary > 80000;

-- 8. MULTIPLE CONDITIONS (AND / OR)
-- Combines multiple criteria for filtering.
SELECT * FROM employees 
WHERE dept_id = 1 AND hire_date > '2021-12-31';

-- 9. SORTING RESULTS (ORDER BY)
-- Sorts the output in ascending (ASC) or descending (DESC) order.
SELECT first_name, salary 
FROM employees 
ORDER BY salary DESC;

-- 10. LIMITING RESULTS (LIMIT)
-- Restricts the number of rows returned (great for "Top N" queries).
-- Note: 'LIMIT' is used in Postgres/MySQL; SQL Server uses 'TOP'.
SELECT first_name, salary 
FROM employees 
ORDER BY salary DESC 
LIMIT 2;

-- 11. AGGREGATE FUNCTIONS
-- Performs calculations on multiple rows to return a single value.
SELECT 
    COUNT(emp_id) AS total_employees,
    AVG(salary) AS average_salary,
    MAX(salary) AS highest_salary 
FROM employees;

-- 12. GROUPING DATA (GROUP BY)
-- Groups rows that have the same values into summary rows.
SELECT dept_id, COUNT(*) AS employee_count 
FROM employees 
GROUP BY dept_id;

-- 13. FILTERING GROUPS (HAVING)
-- Like WHERE, but used specifically to filter grouped records.
SELECT dept_id, AVG(salary) AS avg_dept_salary
FROM employees 
GROUP BY dept_id 
HAVING AVG(salary) > 80000;

-- 14. JOINING TABLES (INNER JOIN)
-- Combines rows from two or more tables based on a related column.
SELECT employees.first_name, departments.dept_name 
FROM employees
INNER JOIN departments 
    ON employees.dept_id = departments.dept_id;

    -- 15. UPDATE & DELETE
-- Modifies existing records (UPDATE) and removes records (DELETE).
-- IMPORTANT: Always use a WHERE clause to avoid affecting all rows!
UPDATE employees 
SET salary = 88000.00 
WHERE emp_id = 101;

DELETE FROM employees 
WHERE emp_id = 104;