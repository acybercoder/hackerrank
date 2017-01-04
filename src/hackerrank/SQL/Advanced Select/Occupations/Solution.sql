/*
 * Pivot the Occupation column in OCCUPATIONS so that each Name is sorted alphabetically and displayed underneath its corresponding Occupation. 
 * The output column headers should be Doctor, Professor, Singer, and Actor, respectively.
 * 
 * Note: Print NULL when there are no more names corresponding to an occupation.
 */

-- MySQL
SET @r1=0, @r2=0, @r3=0, @r4=0;
SELECT MAX(Doctor), MAX(Professor), MAX(Singer), MAX(Actor)
FROM
	(SELECT 
		CASE 
			WHEN Occupation='Doctor' THEN (@r1:=@r1+1)
	        WHEN Occupation='Professor' THEN (@r2:=@r2+1)
	        WHEN Occupation='Singer' THEN (@r3:=@r3+1)
	        WHEN Occupation='Actor' THEN (@r4:=@r4+1) 
	   	END RowNum,
	    CASE WHEN Occupation='Doctor' THEN Name END Doctor,
	    CASE WHEN Occupation='Professor' THEN Name END Professor,
	    CASE WHEN Occupation='Singer' THEN Name END Singer,
	    CASE WHEN Occupation='Actor' THEN Name END Actor
	FROM OCCUPATIONS
	ORDER BY Name
	) Row_Matrix
GROUP BY RowNum;

--Oracle
--solution 1
SELECT Doctor, Professor, Singer, Actor 
FROM 
	(SELECT * FROM 
			(SELECT Name, Occupation, (ROW_NUMBER() OVER (PARTITION BY Occupation ORDER BY Name)) Row_Num 
			FROM OCCUPATIONS) 
    PIVOT 
        ( MAX(Name) FOR Occupation IN ('Doctor' Doctor, 'Professor' Professor, 'Singer' AS Singer, 'Actor' AS Actor)) 
    ORDER BY Row_Num); 

--solution 2
SELECT 
		MAX( CASE WHEN Occupation='Doctor' THEN Name END) AS Doctor, 
		MAX( CASE WHEN Occupation='Professor' THEN Name END) AS Professor, 
		MAX( CASE WHEN Occupation='Singer' THEN Name END) AS Singer, 
		MAX( CASE WHEN Occupation='Actor' THEN Name END) AS Actor 
FROM 
		( SELECT NAME, ROW_NUMBER() OVER (PARTITION BY Occupation ORDER BY Name) AS Row_Num, Occupation 
		FROM OCCUPATIONS )
GROUP BY Row_Num
ORDER BY Row_Num;