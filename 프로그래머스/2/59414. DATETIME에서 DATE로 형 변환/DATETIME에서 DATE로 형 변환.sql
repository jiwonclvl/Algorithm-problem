select animal_id,
       name,
       date_format(date(datetime), '%Y-%m-%d') 날짜
from animal_ins
order by 1