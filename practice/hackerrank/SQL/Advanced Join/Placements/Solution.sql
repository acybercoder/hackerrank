/*
 * You are given three tables: Students, Friends and Packages. 
 * Students contains two columns: ID and Name. Friends contains two columns: ID and Friend_ID (ID of the ONLY best friend). 
 * Packages contains two columns: ID and Salary (offered salary in $ thousands per month).
 * Write a query to output the names of those students whose best friends got offered a higher salary than them. 
 * Names must be ordered by the salary amount offered to the best friends. 
 * It is guaranteed that no two students got same salary offer.
 */

-- MySQL
SELECT s.name
FROM students s
	JOIN friends f
		ON s.id = f.id
	JOIN packages p
		ON s.id = p.id
	JOIN packages pf
		ON f.friend_id = pf.id
WHERE pf.salary>p.salary
ORDER BY pf.salary;

--Oracle
SELECT s.name
FROM students s
	JOIN friends f
		ON s.id = f.id
	JOIN packages p
		ON s.id = p.id
	JOIN packages pf
		ON f.friend_id = pf.id
WHERE pf.salary>p.salary
ORDER BY pf.salary;