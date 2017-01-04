/*
 * Julia asked her students to create some coding challenges. 
 * Write a query to print the hacker_id, name, and the total number of challenges created by each student. 
 * Sort your results by the total number of challenges in descending order. 
 * If more than one student created the same number of challenges, then sort the result by hacker_id. 
 * If more than one student created the same number of challenges and the count is less than the maximum number of challenges created, then exclude those students from the result.
 * 
 * Input Format
 * The following tables contain challenge data:
 * 		Hackers: The hacker_id is the id of the hacker, and name is the name of the hacker.
 * 		Challenges: The challenge_id is the id of the challenge, and hacker_id is the id of the student who created the challenge.
 * 
 */

-- MySQL
SELECT C.hacker_id, H.name, COUNT(C.challenge_id) 
FROM Challenges C
		JOIN Hackers H ON C.hacker_id = H.hacker_id
GROUP BY C.hacker_id, H.name
HAVING COUNT(C.challenge_id) = (SELECT MAX(challenge_count) challenge_count_max
																FROM
																		(SELECT hacker_id, COUNT(challenge_id) challenge_count
																		FROM Challenges
																		GROUP BY hacker_id) creator_count) 
		OR COUNT(C.challenge_id) IN (SELECT challenge_count
																FROM
																		(SELECT hacker_id, COUNT(challenge_id) challenge_count
																		FROM Challenges
																		GROUP BY hacker_id) creator_count
																GROUP BY challenge_count
																HAVING COUNT(hacker_id) = 1 ) 
ORDER BY COUNT(C.challenge_id) DESC, C.hacker_id;


--Oracle
SELECT C.hacker_id, H.name, COUNT(C.challenge_id) 
FROM Challenges C
		JOIN Hackers H ON C.hacker_id = H.hacker_id
GROUP BY C.hacker_id, H.name
HAVING COUNT(C.challenge_id) = (SELECT MAX(challenge_count) challenge_count_max
																FROM
																		(SELECT hacker_id, COUNT(challenge_id) challenge_count
																		FROM Challenges
																		GROUP BY hacker_id))
		OR COUNT(C.challenge_id) IN (SELECT challenge_count
																FROM
																		(SELECT hacker_id, COUNT(challenge_id) challenge_count
																		FROM Challenges
																		GROUP BY hacker_id)
																GROUP BY challenge_count
																HAVING COUNT(hacker_id) = 1 )
ORDER BY COUNT(C.challenge_id) DESC, C.hacker_id;