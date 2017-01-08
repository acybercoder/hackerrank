/**
 * Consider P1(a,b) and P2(c,d) to be two points on a 2D plane where (a, b) are the respective minimum and maximum values of Northern Latitude (LAT_N) and (c,d) are the respective minimum and maximum values of Western Longitude (LONG_W) in STATION.
 * Query the Euclidean Distance between points P1 and P2 and format your answer to display 4 decimal places.
 */

-- MySQL
-- solution1
SELECT FORMAT(SQRT(POWER(MIN(LAT_N)-MIN(LONG_W), 2)+POWER(MAX(LAT_N)-MAX(LONG_W),2)), 4)
FROM STATION; 
-- solution2 FORMAT is rounded also
SELECT ROUND(SQRT(POWER(MIN(LAT_N)-MIN(LONG_W), 2)+POWER(MAX(LAT_N)-MAX(LONG_W),2)), 4)
FROM STATION;


--Oracle
--TO_CHAR is rounded. ROUND/TRUNC doesn't display full decimal places.
SELECT TO_CHAR(SQRT(POWER(MIN(LAT_N)-MIN(LONG_W), 2)+POWER(MAX(LAT_N)-MAX(LONG_W),2)), '00.0000')
FROM STATION; 