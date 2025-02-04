select PRODUCT_CODE,
       SUM(p.PRICE * os.SALES_AMOUNT) SALES
from PRODUCT p inner join OFFLINE_SALE os on p.PRODUCT_ID = os.PRODUCT_ID
group by PRODUCT_CODE
order by 2 desc , 1