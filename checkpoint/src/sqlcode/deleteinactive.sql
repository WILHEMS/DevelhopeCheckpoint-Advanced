DELETE FROM products
WHERE product_id IN(
SELECT p.product_id
FROM products p
LEFT JOIN orders o ON p.product_id = o.product_id
WHERE o.order_id IS NULL OR o.orderdate < DATE_SUB(NOW(), INTERVAL 0.5 YEAR)
);