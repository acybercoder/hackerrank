/*
 * Query all attributes of every Japanese city in the CITY table. 
 * The COUNTRYCODE for Japan is JPN.
 */

-- MySQL
SELECT * FROM CITY WHERE COUNTRYCODE = 'JPN'; 

--Oracle
SELECT * FROM CITY WHERE COUNTRYCODE = 'JPN'; 