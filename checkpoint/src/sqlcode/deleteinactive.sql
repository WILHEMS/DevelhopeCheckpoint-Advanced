DELETE FROM products
WHERE product_id IN(
SELECT product_id
JOIN orders o ON product_id = order_id
WHERE o.order_id IS NULL OR o.orderdate < DATE_SUB(NOW(), INTERVAL 0.5 YEAR)
)