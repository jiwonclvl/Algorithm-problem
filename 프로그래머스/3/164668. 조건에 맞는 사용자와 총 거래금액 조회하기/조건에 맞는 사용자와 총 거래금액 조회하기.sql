SELECT u.USER_ID,
       u.NICKNAME,
       a.total_price
FROM USED_GOODS_USER u
JOIN (
    SELECT b.WRITER_ID,
           SUM(b.PRICE) total_price
    FROM USED_GOODS_BOARD b
    WHERE b.STATUS = 'DONE'
    GROUP BY b.WRITER_ID
) a ON u.USER_ID = a.WRITER_ID
WHERE a.total_price >= 700000
ORDER BY a.total_price
