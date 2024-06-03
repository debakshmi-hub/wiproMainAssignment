-- Find customers who have placed orders above the average order value using a subquery
SELECT customer_id, customer_name, email, city
FROM customers
WHERE customer_id IN (
    SELECT customer_id
    FROM orders
    WHERE amount > (SELECT AVG(amount) FROM orders)
);

-- UNION query to combine two SELECT statements with the same number of columns:
SELECT customer_id, customer_name, email, city
FROM customers
WHERE city = 'Delhi'
UNION
SELECT customer_id, customer_name, email, city
FROM customers
WHERE city = 'Mumbai';
