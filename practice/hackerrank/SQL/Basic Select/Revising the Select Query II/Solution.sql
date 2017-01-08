/*
 * Query the names of all American cities in CITY with populations larger than 120000. 
 * The CountryCode for America is USA.
 */

-- MySQL
SELECT NAME FROM CITY WHERE COUNTRYCODE = 'USA' AND POPULATION > 120000; 

--Oracle
SELECT NAME FROM CITY WHERE COUNTRYCODE = 'USA' AND POPULATION > 120000; --'"' is invalid for string