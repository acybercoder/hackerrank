/*
 * Given the CITY and COUNTRY tables, query the names of all cities where the CONTINENT is 'Africa'.
 * Note: CITY.CountryCode and COUNTRY.Code are matching key columns.
 */

-- MySQL
SELECT CI.NAME 
FROM CITY CI
		JOIN COUNTRY CO ON CI.COUNTRYCODE = CO.CODE AND CO.CONTINENT  = 'Africa'; 

--Oracle
SELECT CI.NAME 
FROM CITY CI
		JOIN COUNTRY CO ON CI.COUNTRYCODE = CO.CODE AND CO.CONTINENT  = 'Africa'; 