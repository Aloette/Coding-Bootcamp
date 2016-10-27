SELECT film_category.category_id
FROM film
INNER JOIN film_category
ON film.film_id=film_category.film_id
GROUP BY film_category.category_id
HAVING COUNT(film.film_id) > 50
ORDER BY COUNT(film.film_id);