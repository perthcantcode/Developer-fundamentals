-- creates a new empty database.
CREATE DATABASE company_db;

-- 2. CREATE TABLE & CONSTRAINTS
-- Creates tables with defined structures and rules (PRIMARY KEY, NOT NULL).
CREATE TABLE departments (
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR(50) NOT NULL
);