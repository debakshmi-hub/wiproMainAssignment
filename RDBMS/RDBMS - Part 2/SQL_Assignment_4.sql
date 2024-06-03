CREATE TABLE products (
    product_id INT PRIMARY KEY,
    product_name VARCHAR(100),
    price DECIMAL(10, 2)
);

INSERT INTO products (product_id, product_name, price) VALUES
(1, 'Product A', 100.00),
(2, 'Product B', 150.00),
(3, 'Product C', 200.00);

-- Start transaction and insert into 'orders' table
START TRANSACTION;
INSERT INTO orders (order_id, customer_id, order_date, amount) 
VALUES (10, 3, '2024-05-25', 200.00);
COMMIT;

-- Start another transaction to update the products table and then rollback the transaction
START TRANSACTION;
UPDATE products
SET price = price * 1.10
WHERE product_id = 1;
ROLLBACK;
