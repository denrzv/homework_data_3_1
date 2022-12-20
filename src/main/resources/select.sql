SELECT product_name
FROM ORDERS o
JOIN CUSTOMERS c
ON o.customer_id = c.id
WHERE LOWER(name) = :customer;