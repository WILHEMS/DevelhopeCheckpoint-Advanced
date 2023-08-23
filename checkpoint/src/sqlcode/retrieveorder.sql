SELECT p.product_name, p.quantity, o.orderdate from customers c
FROM products p
join orders o on c.customer_id = o.customer_id
WHERE customer_id = 1