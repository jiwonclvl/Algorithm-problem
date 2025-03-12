select BOOK_ID,
       date_format(PUBLISHED_DATE, '%Y-%m-%d') PUBLISHED_DATE
from BOOK 
where PUBLISHED_DATE like "%2021%" AND CATEGORY in ('인문')
order by PUBLISHED_DATE 