/*
 * Query all columns for all American cities in CITY with populations larger than 100000. 
 * The CountryCode for America is USA.
 */

-- MySQL
SELECT * FROM CITY WHERE COUNTRYCODE = "USA" AND POPULATION > 100000; 

--Oracle
SELECT * FROM CITY WHERE COUNTRYCODE = 'USA' AND POPULATION > 100000; --'"' is invalid for string