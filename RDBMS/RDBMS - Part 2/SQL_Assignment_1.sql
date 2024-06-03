CREATE TABLE customers (
    customer_id INT PRIMARY KEY,
    customer_name VARCHAR(100),
    email VARCHAR(100),
    city VARCHAR(100)
);

INSERT INTO customers (customer_id, customer_name, email, city) VALUES
(1, 'Amit Sharma', 'amit.sharma@example.com', 'Delhi'),
(2, 'Priya Singh', 'priya.singh@example.com', 'Mumbai'),
(3, 'Ravi Kumar', 'ravi.kumar@example.com', 'Bangalore'),
(4, 'Neha Gupta', 'neha.gupta@example.com', 'Delhi');

SELECT * FROM customers;

SELECT customer_name, email 
FROM customers 
WHERE city = 'Delhi';
