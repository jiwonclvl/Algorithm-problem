select MCDP_CD "진료과 코드",
       count(APNT_YMD) "5월예약건수"
from appointment
where APNT_YMD like "2022-05%"
group by MCDP_CD
order by 2, 1