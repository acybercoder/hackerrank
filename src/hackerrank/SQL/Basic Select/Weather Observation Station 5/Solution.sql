/**
 * Query the two cities in STATION with the shortest and longest CITY names, as well as their respective lengths (i.e.: number of characters in the name). 
 * If there is more than one smallest or largest city, choose the one that comes first when ordered alphabetically.
 */

-- MySQL
SELECT CITY, LENGTH(CITY) FROM STATION
ORDER BY LENGTH(CITY), CITY LIMIT 1;

SELECT CITY, LENGTH(CITY) LEN_CITY FROM STATION
ORDER BY LEN_CITY DESC, CITY LIMIT 1;

--Oracle
SELECT * 
FROM (SELECT CITY, LENGTH(CITY) FROM STATION ORDER BY LENGTH(CITY), CITY) 
WHERE ROWNUM = 1; 

SELECT * 
FROM (SELECT CITY, LENGTH(CITY) LEN_CITY FROM STATION ORDER BY LEN_CITY DESC, CITY) 
WHERE ROWNUM = 1;