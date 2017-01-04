/**
 * Query the Western Longitude (LONG_W) for the smallest Northern Latitude (LAT_N) in STATION that is greater than 38.7880.
 * Round your answer to 4 decimal places.
 */

-- MySQL
SELECT ROUND(LONG_W,4) FROM STATION
WHERE LAT_N > 38.7880
ORDER BY LAT_N LIMIT 1; 

--Oracle
SELECT *
FROM
	(SELECT ROUND(LONG_W,4) FROM STATION
	WHERE LAT_N > 38.7880
	ORDER BY LAT_N)
WHERE ROWNUM=1;