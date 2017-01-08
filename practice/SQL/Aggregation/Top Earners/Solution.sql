/*
 * We define an employee's total earnings to be their monthly  worked, and the maximum total earnings to be the maximum total earnings for any employee in the Employee table. 
 * Write a query to find the maximum total earnings for all employees as well as the total number of employees who have maximum total earnings. 
 * Then print these values as  space-separated integers.
 */

-- MySQL
-- solution 1
SELECT salary*months earnings, COUNT(*) 
FROM EMPLOYEE
GROUP BY earnings ORDER BY earnings DESC
LIMIT 1;
-- solution2
SELECT salary*months earnings, COUNT(*) 
FROM EMPLOYEE
GROUP BY 1 ORDER BY 1 DESC
LIMIT 1;

--Oracle
--solution1
SELECT *
FROM
    (SELECT salary*months earnings, COUNT(*) FROM EMPLOYEE
    GROUP BY salary*months ORDER BY earnings DESC)
WHERE ROWNUM=1;
--solution2
SELECT *
FROM
    (SELECT salary*months earnings, COUNT(*) FROM EMPLOYEE
    GROUP BY salary*months ORDER BY 1 DESC)
WHERE ROWNUM=1;