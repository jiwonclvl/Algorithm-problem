select hour(DATETIME) Hour,
       count(1) count
from ANIMAL_OUTS
where hour(DATETIME) > 8 and hour(DATETIME) < 20
group by 1
order by 1