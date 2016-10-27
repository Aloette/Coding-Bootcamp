SELECT fist_name, last_name
FROM sakila.actor
WHERE last_name LIKE '%SON%' /* actors with "SON" in their last name */
ORDER BY first_name