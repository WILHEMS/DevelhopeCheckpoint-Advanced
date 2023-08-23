SELECT c.category_name, SUM(p.price * o.quantity) AS total_sales
FROM products JOIN orders o ON p.product_id = o.product_id
JOIN categories c ON p.category_id = c.category_id
GROUP BY c.category_name;