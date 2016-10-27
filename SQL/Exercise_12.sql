/* Find the title of English films having category of 'Documentary' */

SELECT film.title
FROM film
INNER JOIN language
ON film.language_id=language.language_id
INNER JOIN film_category
ON film_category.film_id=film.film_id
INNER JOIN category
ON film_category.category_id=category.category_id
WHERE language.name = 'English' AND category.name = 'Documentary'
