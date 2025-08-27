SELECT AVG(rental_rate) FROM film
SELECT COUNT(*) AS count FROM film WHERE title LIKE 'C%';
SELECT MAX(length) AS en_uzun_film_dakika FROM film WHERE rental_rate = 0.99;
SELECT COUNT(DISTINCT replacement_cost) AS farkli_replacement_cost_sayisi FROM film WHERE length > 150;