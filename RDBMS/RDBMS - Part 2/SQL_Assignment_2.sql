CREATE TABLE orders (
    order_id INT PRIMARY KEY,
    customer_id INT,
    order_date DATE,
    amount DECIMAL(10, 2),
    FOREIGN KEY (customer_id) REFERENCES customers(customer_id)
);

INSERT INTO orders (order_id, customer_id, order_date, amount) VALUES
(1, 1, '2024-05-20', 250.00),
(2, 2, '2024-05-21', 150.00),
(3, 1, '2024-05-22', 300.00);

-- Query using an INNER JOIN to combine orders and customers tables for customers in a specified region (e.g., 'Delhi')
SELECT customers.customer_id, customers.customer_name, customers.email, customers.city, orders.order_id, orders.order_date, orders.amount
FROM customers
INNER JOIN orders ON customers.customer_id = orders.customer_id
WHERE customers.city = 'Delhi';

-- Query using a LEFT JOIN to display all customers including those without orders:
SELECT customers.customer_id, customers.customer_name, customers.email, customers.city, orders.order_id, orders.order_date, orders.amount
FROM customers
LEFT JOIN orders ON customers.customer_id = orders.customer_id;




