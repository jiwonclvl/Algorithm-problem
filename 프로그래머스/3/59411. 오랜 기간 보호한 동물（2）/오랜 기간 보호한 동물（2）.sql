select ANIMAL_ID,
       name
from
(
select i.ANIMAL_ID,
       i.name,
       DATEDIFF(o.DATETIME, i.DATETIME) datediff
from ANIMAL_INS i left join ANIMAL_OUTS o on i.ANIMAL_ID = o.ANIMAL_ID
) a
order by datediff desc
limit 2