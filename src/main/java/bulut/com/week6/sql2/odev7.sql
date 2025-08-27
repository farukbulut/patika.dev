-- 1. Film tablosunda filmleri rating değerlerine göre gruplayınız
SELECT rating, COUNT(*) as film_sayisi
FROM film
GROUP BY rating
ORDER BY rating;

-- 2. Film tablosunda replacement_cost'a göre grupladığımızda
-- film sayısı 50'den fazla olan replacement_cost değeri ve film sayısı
SELECT replacement_cost, COUNT(*) as film_sayisi
FROM film
GROUP BY replacement_cost
HAVING COUNT(*) > 50
ORDER BY film_sayisi DESC;

-- 3. Customer tablosunda store_id değerlerine karşılık gelen müşteri sayıları
SELECT store_id, COUNT(*) as musteri_sayisi
FROM customer
GROUP BY store_id
ORDER BY store_id;

-- 4. City tablosunda country_id'ye göre gruplandıktan sonra
-- en fazla şehir sayısı barındıran country_id ve şehir sayısı
SELECT country_id, COUNT(*) as sehir_sayisi
FROM city
GROUP BY country_id
ORDER BY sehir_sayisi DESC
    LIMIT 1;