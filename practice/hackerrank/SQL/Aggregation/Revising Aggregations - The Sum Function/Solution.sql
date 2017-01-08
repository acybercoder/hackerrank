/*
 * Query the total population of all cities in CITY where District is California.
 */

-- MySQL
SELECT SUM(POPULATION) FROM CITY WHERE DISTRICT = 'California';

--Oracle
SELECT SUM(POPULATION) FROM CITY WHERE DISTRICT = 'California';