-- Create a new database
CREATE DATABASE library_database;

-- Switch to the newly created database
USE library_database;

-- Create the authors table
CREATE TABLE authors (
    author_id INT PRIMARY KEY AUTO_INCREMENT,
    author_name VARCHAR(100) NOT NULL
);

-- Create the books table
CREATE TABLE books (
    book_id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(255) NOT NULL,
    author_id INT,
    genre VARCHAR(50),
    published_year INT,
    FOREIGN KEY (author_id) REFERENCES authors(author_id)
);

-- Create the loans table
CREATE TABLE loans (
    loan_id INT PRIMARY KEY AUTO_INCREMENT,
    book_id INT,
    loan_date DATE,
    return_date DATE,
    FOREIGN KEY (book_id) REFERENCES books(book_id)
);

-- Alter the books table to add a new column for available copies
ALTER TABLE books
ADD available_copies INT DEFAULT 0;

DROP TABLE loans;