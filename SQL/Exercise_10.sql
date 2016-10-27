SELECT actor.actor_id, actor.first_name, actor.last_name, COUNT(film_actor.film_id) AS NumberOfFilmsByEachActor
FROM actor
INNER JOIN film_actor
ON actor.actor_id=film_actor.actor_id
GROUP BY actor.actor_id
ORDER BY COUNT(film_actor.film_id)