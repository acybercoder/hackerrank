/**
 * Query the list of CITY names starting with vowels (a, e, i, o, u) from STATION. 
 * Your result cannot contain duplicates.
 */

-- MySQL
-- Solution 1
SELECT DISTINCT(CITY) FROM STATION WHERE LOWER(LEFT(CITY, 1)) IN ('a', 'e', 'i', 'o', 'u'); 
-- Solution 2
SELECT DISTINCT(CITY) FROM STATION WHERE LOWER(SUBSTRING(CITY, 1, 1)) IN ('a', 'e', 'i', 'o', 'u'); 
-- Solution 3
SELECT DISTINCT(CITY) FROM STATION WHERE LOWER(SUBSTR(CITY, 1, 1)) IN ('a', 'e', 'i', 'o', 'u'); 

--Oracle
SELECT DISTINCT(CITY) FROM STATION WHERE LOWER(SUBSTR(CITY, 1, 1)) IN ('a', 'e', 'i', 'o', 'u');
