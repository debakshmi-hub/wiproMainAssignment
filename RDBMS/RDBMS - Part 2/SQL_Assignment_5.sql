-- Start the transaction
START TRANSACTION;

-- Insert first order and set SAVEPOINT
INSERT INTO orders (order_id, customer_id, order_date, amount) 
VALUES (5, 1, '2024-05-25', 100.00);
SAVEPOINT sp1;

-- Insert second order and set SAVEPOINT
INSERT INTO orders (order_id, customer_id, order_date, amount) 
VALUES (6, 2, '2024-05-25', 150.00);
SAVEPOINT sp2;

-- Insert third order and set SAVEPOINT
INSERT INTO orders (order_id, customer_id, order_date, amount) 
VALUES (7, 3, '2024-05-25', 200.00);
SAVEPOINT sp3;

-- Insert fourth order and set SAVEPOINT
INSERT INTO orders (order_id, customer_id, order_date, amount) 
VALUES (8, 4, '2024-05-25', 250.00);
SAVEPOINT sp4;

-- Rollback to the second SAVEPOINT
ROLLBACK TO SAVEPOINT sp2;

-- Commit the overall transaction
COMMIT;
