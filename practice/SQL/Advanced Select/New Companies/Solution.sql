/*
 * Amber's conglomerate corporation just acquired some new companies. 
 * Each of the companies follows this hierarchy:
 * Given the table schemas below, write a query to print the company_code, founder name, total number of lead managers, total number of senior managers, total number of managers, and total number of employees. 
 * Order your output by ascending company_code.
 * Note:
 * 		The tables may contain duplicate records.
 * 		The company_code is string, so the sorting should not be alphanumeric. 
 * 		For example, if the company_codes are C_1, C_2, and C_10, then the ascending company_codes will be C_1, C_10, and C_2.
 * 
 */

-- MySQL
SELECT company_code, founder, 
			(SELECT COUNT(DISTINCT lead_manager_code) FROM Lead_Manager WHERE C.company_code = company_code),
			(SELECT COUNT(DISTINCT senior_manager_code) FROM Senior_Manager WHERE C.company_code = company_code),
			(SELECT COUNT(DISTINCT manager_code) FROM Manager WHERE C.company_code = company_code),
			(SELECT COUNT(DISTINCT employee_code) FROM Employee WHERE C.company_code = company_code)
FROM Company C
ORDER BY C.company_code;

--Oracle
SELECT company_code, founder, 
			(SELECT COUNT(DISTINCT lead_manager_code) FROM Lead_Manager WHERE C.company_code = company_code),
			(SELECT COUNT(DISTINCT senior_manager_code) FROM Senior_Manager WHERE C.company_code = company_code),
			(SELECT COUNT(DISTINCT manager_code) FROM Manager WHERE C.company_code = company_code),
			(SELECT COUNT(DISTINCT employee_code) FROM Employee WHERE C.company_code = company_code)
FROM Company C
ORDER BY C.company_code;