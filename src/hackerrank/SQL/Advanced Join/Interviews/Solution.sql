/*
 * Samantha interviews many candidates from different colleges using coding challenges and contests. Write a query to print the contest_id, hacker_id, name, and the sums of total_submissions, total_accepted_submissions, total_views, and total_unique_views for each contest sorted by contest_id. 
 * Exclude the contest from the result if all four sums are 0.
 * 
 * Note: A specific contest can be used to screen candidates at more than one college, but each college only holds 1 screening contest.
 * 
 * Input Format
 * The following tables hold interview data:
 * 		Contests: The contest_id is the id of the contest, hacker_id is the id of the hacker who created the contest, and name is the name of the hacker.
 * 		Colleges: The college_id is the id of the college, and contest_id is the id of the contest that Samantha used to screen the candidates.
 * 		Challenges: The challenge_id is the id of the challenge that belongs to one of the contests whose contest_id Samantha forgot, and college_id is the id of the college where the challenge was given to candidates.
 *		View_Stats: The challenge_id is the id of the challenge, total_views is the number of times the challenge was viewed by candidates, and total_unique_views is the number of times the challenge was viewed by unique candidates.
 *		Submission_Stats: The challenge_id is the id of the challenge, total_submission is the number of submissions for the challenge, and total_accepted_submission is the number of submissions that achieved full scores.
 * 
 * 
 */

-- MySQL
SELECT CT.contest_id , CT.hacker_id , CT.NAME, SUM(TS), SUM(TAS), SUM(TV), SUM(TUV) 
FROM CONTESTS CT 
	 JOIN COLLEGES  CL 
			ON CL.contest_id  = CT.contest_id  
	 JOIN CHALLENGES  CH 
			ON CH.college_id = CL.college_id 
	LEFT JOIN 
			( SELECT challenge_id , SUM(TOTAL_SUBMISSIONS) AS TS, SUM(TOTAL_ACCEPTED_SUBMISSIONS)  TAS 
			FROM SUBMISSION_STATS GROUP BY challenge_id  ) S 
		ON S.challenge_id  = CH.challenge_id  
	LEFT JOIN 
			( SELECT challenge_id , SUM(TOTAL_VIEWS) AS TV, SUM(TOTAL_UNIQUE_VIEWS)  TUV 
			FROM VIEW_STATS GROUP BY challenge_id  ) V 
		ON V.challenge_id  = CH.challenge_id  
GROUP BY CT.contest_id , CT.hacker_id , CT.NAME 
ORDER BY CT.contest_id ;

--Oracle
SELECT CT.contest_id , CT.hacker_id , CT.NAME, SUM(TS), SUM(TAS), SUM(TV), SUM(TUV) 
FROM CONTESTS CT 
	 JOIN COLLEGES  CL 
			ON CL.contest_id  = CT.contest_id  
	 JOIN CHALLENGES  CH 
			ON CH.college_id = CL.college_id 
	LEFT JOIN 
			( SELECT challenge_id , SUM(TOTAL_SUBMISSIONS) AS TS, SUM(TOTAL_ACCEPTED_SUBMISSIONS)  TAS 
			FROM SUBMISSION_STATS GROUP BY challenge_id  ) S 
		ON S.challenge_id  = CH.challenge_id  
	LEFT JOIN 
			( SELECT challenge_id , SUM(TOTAL_VIEWS) AS TV, SUM(TOTAL_UNIQUE_VIEWS)  TUV 
			FROM VIEW_STATS GROUP BY challenge_id  ) V 
		ON V.challenge_id  = CH.challenge_id  
GROUP BY CT.contest_id , CT.hacker_id , CT.NAME 
ORDER BY CT.contest_id ;