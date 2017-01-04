/*
 * Query the sum of the populations for all Japanese cities in CITY. 
 * The COUNTRYCODE for Japan is JPN.
 */

-- MySQL
SELECT SUM(POPULATION) FROM CITY WHERE COUNTRYCODE = 'JPN'; 

--Oracle
SELECT SUM(POPULATION) FROM CITY WHERE COUNTRYCODE = 'JPN'; 