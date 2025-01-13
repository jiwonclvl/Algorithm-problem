select PRODUCT_ID,
       PRODUCT_NAME,
       PRODUCT_CD,
       CATEGORY,
       price PRICE
from food_product
order by price desc
LIMIT 1