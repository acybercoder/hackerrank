/*
 * Query the names of all the Japanese cities in the CITY table.
 * The COUNTRYCODE for Japan is JPN.
 */

-- MySQL
SELECT NAME FROM CITY WHERE COUNTRYCODE = 'JPN'; 

--Oracle
SELECT NAME FROM CITY WHERE COUNTRYCODE = 'JPN'; 