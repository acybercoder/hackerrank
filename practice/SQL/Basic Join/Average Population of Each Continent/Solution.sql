/*
 * Given the CITY and COUNTRY tables, query the names of all the continents (COUNTRY.Continent) and their respective average city populations (CITY.Population) rounded down to the nearest integer.
 * Note: CITY.CountryCode and COUNTRY.Code are matching key columns. 
 * Do not include continents without cities in your output.
 */

-- MySQL
SELECT CO.CONTINENT, FLOOR(AVG(CI.POPULATION)) 
FROM COUNTRY CO
		JOIN CITY CI ON CI.COUNTRYCODE = CO.CODE
GROUP BY CO.CONTINENT;
		

--Oracle
SELECT CO.CONTINENT, FLOOR(AVG(CI.POPULATION)) 
FROM COUNTRY CO
		JOIN CITY CI ON CI.COUNTRYCODE = CO.CODE
GROUP BY CO.CONTINENT;