select CAR_TYPE,
       count(1) CARS
from CAR_RENTAL_COMPANY_CAR 
where OPTIONS like '%통풍%' or OPTIONS like '%열선%' or OPTIONS like '%가죽%'
group by CAR_TYPE
order by 1