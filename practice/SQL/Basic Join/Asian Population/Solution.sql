/**
 * Given the CITY and COUNTRY tables, query the sum of the populations of all cities where the CONTINENT is 'Asia'.
 * Note: CITY.CountryCode and COUNTRY.Code are matching key columns.
 */

-- MySQL
SELECT SUM(CI.POPULATION)
FROM CITY CI
		JOIN COUNTRY CO ON CI.COUNTRYCODE=CO.CODE AND CO.CONTINENT = 'Asia'; 

--Oracle
SELECT SUM(CI.POPULATION)
FROM CITY CI
		JOIN COUNTRY CO ON CI.COUNTRYCODE=CO.CODE AND CO.CONTINENT = 'Asia'; 
