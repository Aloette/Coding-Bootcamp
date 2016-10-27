SELECT film.title, category.name
FROM film
INNER JOIN film_category
ON film.film_id=film_category.film_id
INNER JOIN category
ON film_category.category_id=category.category_id
ORDER BY film.title

