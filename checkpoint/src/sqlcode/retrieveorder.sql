SELECT p.product_name, p.quantity, o.orderdate
FROM customers c
JOIN orders o on c.customer_id = o.customer_id
WHERE customer_id = 1