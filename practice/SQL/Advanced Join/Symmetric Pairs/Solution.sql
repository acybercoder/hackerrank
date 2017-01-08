/*
 * You are given a table, Functions, containing two columns: X and Y. 
 * Two pairs (X1, Y1) and (X2, Y2) are said to be symmetric pairs if X1 = Y2 and X2 = Y1.
 * Write a query to output all such symmetric pairs in ascending order by the value of X.
 */

-- MySQL
SET @ra=0, @rb=0;
SELECT fa.x, fa.y 
FROM 
		(SELECT @ra:=@ra+1 rowno, x, y
		FROM Functions) fa,
		(SELECT @rb:=@rb+1 rowno, x, y
		FROM Functions) fb
WHERE fa.x = fb.y AND fb.x = fa.y AND fa.rowno <> fb.rowno AND fa.x <= fb.x
GROUP BY fa.x, fa.y
ORDER BY fa.x;

--Oracle
SELECT fa.x, fa.y 
FROM 
		(SELECT rownum rowno, x, y
		FROM Functions) fa,
		(SELECT rownum rowno, x, y
		FROM Functions) fb
WHERE fa.x = fb.y AND fb.x = fa.y AND fa.rowno <> fb.rowno AND fa.x <= fb.x
GROUP BY fa.x, fa.y
ORDER BY fa.x;