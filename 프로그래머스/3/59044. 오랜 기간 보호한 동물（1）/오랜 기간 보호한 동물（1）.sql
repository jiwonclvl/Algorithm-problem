select i.Name,
       i.DATETIME
from ANIMAL_INS i left join ANIMAL_OUTS o on i.ANIMAL_ID = o.ANIMAL_ID
where o.ANIMAL_ID is NULL
order by 2
limit 3