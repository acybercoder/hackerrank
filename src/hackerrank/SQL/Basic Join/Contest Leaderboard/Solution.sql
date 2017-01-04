/*
 * The total score of a hacker is the sum of their maximum scores for all of the challenges. 
 * Write a query to print the hacker_id, name, and total score of the hackers ordered by the descending score. 
 * If more than one hacker achieved the same total score, then sort the result by ascending hacker_id. 
 * Exclude all hackers with a total score of 0 from your result.
 * 
 * Input Format
 * The following tables contain challenge data:
 * 		Hackers: The hacker_id is the id of the hacker, and name is the name of the hacker.
 * 		Submissions: The submission_id is the id of the submission, hacker_id is the id of the hacker who made the submission, challenge_id is the id of the challenge for which the submission belongs to, and score is the score of the submission.
 * 
 */

-- MySQL
SELECT S.hacker_id, H.name, SUM(S.score)
FROM (SELECT hacker_id, challenge_id, MAX(score) score
			FROM Submissions
			GROUP BY hacker_id, challenge_id) S
		JOIN Hackers H ON S.hacker_id = H.hacker_id
GROUP BY S.hacker_id, H.name
HAVING SUM(S.score) >0
ORDER BY SUM(S.score) DESC, S.hacker_id;

--Oracle
SELECT S.hacker_id, H.name, SUM(S.score)
FROM (SELECT hacker_id, challenge_id, MAX(score) score
			FROM Submissions
			GROUP BY hacker_id, challenge_id) S
		JOIN Hackers H ON S.hacker_id = H.hacker_id
GROUP BY S.hacker_id, H.name
HAVING SUM(S.score) >0
ORDER BY SUM(S.score) DESC, S.hacker_id;