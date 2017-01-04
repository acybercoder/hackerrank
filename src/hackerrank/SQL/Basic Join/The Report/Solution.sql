/*
 * You are given two tables: Students and Grades. 
 * Students contains three columns ID, Name and Marks.
 * Ketty gives Eve a task to generate a report containing three columns:  Name, Grade and Mark. Ketty doesn't want the NAMES of those students who received a grade lower than 8. 
 * The report must be in descending order by grade -- i.e. higher grades are entered first. 
 * If there is more than one student with the same grade (1-10) assigned to them, order those particular students by their name alphabetically. 
 * Finally, if the grade is lower than 8, use "NULL" as their name and list them by their marks in ascending order.
 * 
 * Write a query to help Eve.
 */

-- MySQL
SELECT S.Name, G.Grade, S.Marks 
FROM Students S
		JOIN Grades G ON S.Marks >= G.Min_Mark AND S.Marks <= G.Max_Mark AND G.Grade >=8 
ORDER BY G.Grade DESC, S.Name; 

SELECT 'NULL', G.Grade, S.Marks 
FROM Students S
		JOIN Grades G ON S.Marks >= G.Min_Mark AND S.Marks <= G.Max_Mark AND G.Grade < 8 
ORDER BY G.Grade DESC, S.Marks; 

--Oracle
SELECT * FROM CITY WHERE COUNTRYCODE = 'JPN'; 