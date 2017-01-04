/*
 * Write a query identifying the type of each record in the TRIANGLES table using its three side lengths. 
 * 
 * Output one of the following statements for each record in the table:
 * Not A Triangle: The given values of A, B, and C don't form a triangle.
 * Equilateral: It's a triangle with 3 sides of equal length.
 * Isosceles: It's a triangle with 2 sides of equal length.
 * Scalene: It's a triangle with  sides of differing lengths.
 */

-- MySQL
SELECT 
	CASE 
		WHEN A+B<=C OR B+C<=A OR A+C<=B THEN 'Not A Triangle'
		WHEN A=B AND B=C THEN 'Equilateral'
		WHEN (A=B AND A<>C) OR (B=C AND B<>A) OR (A=C AND A<>B) THEN 'Isosceles'
		ELSE 'Scalene'
	END
FROM TRIANGLES;

--Oracle
SELECT 
	CASE 
		WHEN A+B<=C OR B+C<=A OR A+C<=B THEN 'Not A Triangle'
		WHEN A=B AND B=C THEN 'Equilateral'
		WHEN (A=B AND A<>C) OR (B=C AND B<>A) OR (A=C AND A<>B) THEN 'Isosceles'
		ELSE 'Scalene'
	END
FROM TRIANGLES;