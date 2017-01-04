/*
 * Query the average population for all cities in CITY, rounded down to the nearest integer.
 */

-- MySQL
SELECT FLOOR(AVG(POPULATION)) FROM CITY;

--Oracle
SELECT FLOOR(AVG(POPULATION)) FROM CITY;