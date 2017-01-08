/**
 * Query the list of CITY names ending with vowels (a, e, i, o, u) from STATION. 
 * Your result cannot contain duplicates.
 */

-- MySQL
-- Solution 1
SELECT DISTINCT(CITY) FROM STATION WHERE LOWER(RIGHT(CITY, 1)) IN ('a', 'e', 'i', 'o', 'u'); 
-- Solution 2
SELECT DISTINCT(CITY) FROM STATION WHERE LOWER(SUBSTRING(CITY, LENGTH(CITY), 1)) IN ('a', 'e', 'i', 'o', 'u'); 
-- Solution 3
SELECT DISTINCT CITY FROM STATION WHERE LOWER(SUBSTR(CITY, -1, 1)) IN ('a', 'e', 'i', 'o', 'u'); 

--Oracle
SELECT DISTINCT CITY FROM STATION WHERE LOWER(SUBSTR(CITY, -1, 1)) IN ('a', 'e', 'i', 'o', 'u');
