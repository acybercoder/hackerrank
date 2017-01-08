/**
 * A median is defined as a number separating the higher half of a data set from the lower half. 
 * Query the median of the Northern Latitudes (LAT_N) from STATION and round your answer to 4 decimal places.
 * Note: Oracle solutions are not permitted for this challenge.
 */

-- MySQL
SELECT ROUND(AVG(S0.LAT_N), 4)
FROM STATION S0
WHERE 
(SELECT SUM(CASE WHEN LAT_N=S0.LAT_N THEN 1 ELSE 0 END) FROM STATION)
>=(SELECT ABS(SUM(SIGN(S0.LAT_N-LAT_N))) FROM STATION);

--Oracle
--solution1
SELECT ROUND(MEDIAN(LAT_N), 4) FROM STATION; 
--solution2
SELECT ROUND(AVG(S0.LAT_N), 4)
FROM STATION S0
WHERE 
(SELECT SUM(CASE WHEN LAT_N=S0.LAT_N THEN 1 ELSE 0 END) FROM STATION)
>=(SELECT ABS(SUM(SIGN(S0.LAT_N-LAT_N))) FROM STATION);