SELECT category.name, AVG(film.replacement_cost - film.rental_rate)
FROM film_category
INNER JOIN category
ON category.category_id=film_category.category_id
INNER JOIN film
ON film_category.film_id=film.film_id
GROUP BY film_category.category_id
HAVING AVG(film.replacement_cost - film.rental_rate) > 17