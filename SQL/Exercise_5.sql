SELECT film_category.category_id, COUNT(film.film_id) /* AS NumberOfFilms */
FROM film
INNER JOIN film_category
ON film.film_id=film_category.film_id
GROUP BY film_category.category_id
ORDER BY COUNT(film.film_id) /* i ORDER BY NumberOfFilms (apo to AS) */

