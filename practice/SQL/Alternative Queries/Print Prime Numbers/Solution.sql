/*
 * Write a query to print all prime numbers less than or equal to 1000. 
 * Print your result on a single line, and use the ampersand (&) character as your separator (instead of a space).
 * For example, the output for all prime numbers <=0 would be:
 * 		2&3&5&7
 */

-- MySQL
SET @r=0;
SELECT GROUP_CONCAT(prime.num SEPARATOR '&')
FROM
        (SELECT seq.num, 
        					CASE 
	        					WHEN seq.num = 1 THEN 0
	                            WHEN seq.num IN (2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31) THEN 1
	                            WHEN MOD(seq.num, 2) = 0 THEN 0
	                            WHEN MOD(seq.num, 3) = 0 THEN 0
	                            WHEN MOD(seq.num, 5) = 0 THEN 0
	                            WHEN MOD(seq.num, 7) = 0 THEN 0
	                            WHEN MOD(seq.num, 11) = 0 THEN 0
	                            WHEN MOD(seq.num, 13) = 0 THEN 0
	                            WHEN MOD(seq.num, 17) = 0 THEN 0
	                            WHEN MOD(seq.num, 19) = 0 THEN 0
	                            WHEN MOD(seq.num, 23) = 0 THEN 0
	                            WHEN MOD(seq.num, 29) = 0 THEN 0
	                            WHEN MOD(seq.num, 31) = 0 THEN 0
	                            ELSE 1
                            END prime_flag
                FROM 
                         (SELECT @r:=@r+1 num
                          FROM 
                                  (SELECT c1.Table_name
                                   FROM information_schema.columns c1, information_schema.columns c2
                                   WHERE c1.Table_name=c2.Table_name) t_inner
                          LIMIT 1000) seq
               )prime 
WHERE prime.prime_flag=1
ORDER BY prime.num;

--Oracle
SELECT LISTAGG(Prime.num, '&') WITHIN GROUP (ORDER BY Prime.num) 
FROM
        (SELECT Seq.num,
                    CASE 
	                    WHEN Seq.num = 1 THEN 0
	                    WHEN Seq.num IN (2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31) THEN 1
	                    WHEN MOD(Seq.num, 2) = 0 THEN 0
	                    WHEN MOD(Seq.num, 3) = 0 THEN 0
	                    WHEN MOD(Seq.num, 5) = 0 THEN 0
	                    WHEN MOD(Seq.num, 7) = 0 THEN 0
	                    WHEN MOD(Seq.num, 11) = 0 THEN 0
	                    WHEN MOD(Seq.num, 13) = 0 THEN 0
	                    WHEN MOD(Seq.num, 17) = 0 THEN 0
	                    WHEN MOD(Seq.num, 19) = 0 THEN 0
	                    WHEN MOD(Seq.num, 23) = 0 THEN 0
	                    WHEN MOD(Seq.num, 29) = 0 THEN 0
	                    WHEN MOD(Seq.num, 31) = 0 THEN 0
	                    ELSE 1
                    END prime_flag
        FROM (SELECT LEVEL num
                    FROM DUAL CONNECT by LEVEL <= 1000) Seq) Prime
WHERE Prime.prime_flag = 1;