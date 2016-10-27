SELECT film.film_id, film.title
FROM film
WHERE film.film_id NOT IN (SELECT inventory.film_id FROM inventory)