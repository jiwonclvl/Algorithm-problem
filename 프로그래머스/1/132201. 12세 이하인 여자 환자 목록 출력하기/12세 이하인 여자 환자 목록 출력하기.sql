select PT_NAME,    
       PT_NO,
       GEND_CD,
       AGE,
       if(TLNO is null, "NONE", TLNO)
from PATIENT 
where AGE <= 12 and GEND_CD = "W"
order by age desc, PT_NAME