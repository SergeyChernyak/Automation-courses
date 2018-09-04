
SELECT country.name AS `country name`, count(distinct region.id) AS `regions count`
FROM country
INNER JOIN 
region 
ON country.id = region.country_id
GROUP BY country.name
ORDER BY count(region.id) DESC
LIMIT 5;


SELECT country.name AS `country name`, count(city.id) AS `cities count`
FROM country
INNER JOIN 
region 
ON country.id = region.country_id
INNER JOIN city
ON region.id = city.region_id
GROUP BY country.name
ORDER BY count(city.id) DESC
LIMIT 5;


SELECT country.name AS `country name`, count(distinct region.id) AS `regions count`, count(city.id) AS `cities count` 
FROM country
INNER JOIN 
region
ON region.country_id = country.id 
INNER JOIN city
ON city.region_id = region.id
GROUP BY country.name
ORDER BY count(distinct region.id) DESC, count(city.id) DESC;
