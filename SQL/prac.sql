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