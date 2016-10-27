SELECT film_category.category_id, AVG(film.replacement_cost - film.rental_rate)
FROM film_category
INNER JOIN film
ON film.film_id=film_category.category_id
GROUP BY film_category.category_id
HAVING AVG(replacement_cost - rental_rate) > 17

/* Display the film categories (film_category_id)
 where the average difference between the film replacement cost 
 and the rental rate is larger than 17 */