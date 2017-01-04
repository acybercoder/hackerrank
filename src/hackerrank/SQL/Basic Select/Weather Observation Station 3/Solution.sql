/**
 * Query a list of CITY names from STATION with even ID numbers only. 
 * You may print the results in any order, but must exclude duplicates from your answer.
 */

-- MySQL
SELECT DISTINCT CITY FROM STATION WHERE MOD(ID, 2)=0; #ID%2 is supported also

--Oracle
SELECT DISTINCT CITY FROM STATION WHERE MOD(ID, 2)=0; 
