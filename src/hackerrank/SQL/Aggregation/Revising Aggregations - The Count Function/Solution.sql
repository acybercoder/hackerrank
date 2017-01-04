/*
 * Query a count of the number of cities in CITY having a Population larger than 100,000.
 */

-- MySQL
SELECT COUNT(ID) FROM CITY WHERE POPULATION > 100000;

--Oracle
SELECT COUNT(ID) FROM CITY WHERE POPULATION > 100000;