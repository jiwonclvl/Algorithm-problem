select count(1) users
from user_info
where (age between 20 and 29) and joined like "2021%"