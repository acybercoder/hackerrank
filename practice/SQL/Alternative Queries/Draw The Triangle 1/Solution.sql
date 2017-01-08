/*
 * P(R) represents a pattern drawn by Julia in R rows. The following pattern represents P(5):
 * 		* * * * * 
 * 		* * * * 
 * 		* * * 
 * 		* * 
 * 		*
 * Write a query to print the pattern P(20).
 */

-- MySQL
-- solution1
SET @NUMBER = 21;
SELECT REPEAT('* ', @NUMBER := @NUMBER - 1) 
FROM information_schema.tables LIMIT 20;
-- solution2
SET @NUMBER = 42;
SELECT LPAD('* ', @NUMBER := (@NUMBER - 2), '* ') 
FROM information_schema.tables LIMIT 20;
-- solution3
SET @NUMBER = 42;
SELECT RPAD('*', @NUMBER := (@NUMBER - 2), ' *') 
FROM information_schema.tables LIMIT 20;

--Oracle
SELECT RPAD('*', LEVEL*2, ' *') 
FROM dual
CONNECT BY LEVEL <= 20;