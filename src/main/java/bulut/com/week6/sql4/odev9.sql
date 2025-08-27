--1. SORGU
SELECT
    ct.city, cn.country
FROM
    city as ct
        INNER JOIN country as cn ON cn.country_id = ct.country_id

--2. SORGU
SELECT
    p.payment_id, c.first_name, c.last_name
FROM
    customer as c
        INNER JOIN payment as p ON p.customer_id = c.customer_id

--3. SORGU
SELECT
    r.rental_id, c.first_name, c.last_name
FROM
    customer as c
        INNER JOIN rental as r ON r.customer_id = c.customer_id