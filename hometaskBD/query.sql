
select country.name as `country name`, count(distinct region.id) as `regions count`
FROM country
inner join 
region 
on country.id = region.country_id
group by country.name
order by count(region.id) desc
limit 5;


select country.name as `country name`, count(city.id) as `cities count`
FROM country
inner join 
region 
on country.id = region.country_id
inner join city
on region.id = city.region_id
group by country.name
order by count(city.id) desc
limit 5;


select country.name as `country name`, count(distinct region.id) as `regions count`, count(city.id) as `cities count` 
from country
inner join 
region
on region.country_id = country.id 
inner join city
on city.region_id = region.id
group by country.name
order by count(distinct region.id) desc, count(city.id) desc;
