SELECT address
FROM sakila.address
WHERE district = ''		/* kanonika eprepe IS NULL */
ORDER BY city_id ASC