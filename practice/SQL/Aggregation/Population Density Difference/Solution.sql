/*
 * Query the difference between the maximum and minimum populations in CITY.
 */

-- MySQL
SELECT MAX(POPULATION) - MIN(POPULATION) FROM CITY;

--Oracle
SELECT MAX(POPULATION) - MIN(POPULATION) FROM CITY;