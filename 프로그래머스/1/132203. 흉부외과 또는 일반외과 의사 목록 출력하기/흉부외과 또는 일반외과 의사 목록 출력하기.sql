select dr_name,
       dr_id,
       MCDP_CD,
       date_format(HIRE_YMD,'%Y-%m-%d') HIRE_YMD
from doctor
where MCDP_CD in ("CS", "GS")
order by HIRE_YMD desc