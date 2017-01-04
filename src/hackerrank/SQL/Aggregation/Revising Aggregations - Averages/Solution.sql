/*
 * Query the average population of all cities in CITY where District is California.
 */

-- MySQL
SELECT AVG(POPULATION) FROM CITY WHERE DISTRICT = 'California';

--Oracle
SELECT AVG(POPULATION) FROM CITY WHERE DISTRICT = 'California';