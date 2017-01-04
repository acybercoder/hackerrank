/*
 * Julia conducted a 15 days of learning SQL contest. 
 * The start date of the contest was March 01, 2016 and the end date was March 15, 2016.
 * Write a query to print total number of unique hackers who made at least  submission each day (starting on the first day of the contest), and find the hacker_id and name of the hacker who made maximum number of submissions each day. If more than one such hacker has a maximum number of submissions, print the lowest hacker_id. 
 * The query should print this information for each day of the contest, sorted by the date.
 * 
 * Input Format
 * The following tables hold contest data:
 * 		Hackers: The hacker_id is the id of the hacker, and name is the name of the hacker.
 * 		Submissions: The submission_date is the date of the submission, submission_id is the id of the submission, hacker_id is the id of the hacker who made the submission, and score is the score of the submission.
 */

-- MySQL
SET @r=0, @sub_date = '';

SELECT max_sub.submission_date, 
            max_sub.submission_count, 
            Hackers.hacker_id, 
            Hackers.name
FROM Hackers 
    JOIN
                (SELECT submission_date, submission_num, hacker_id
                FROM
                        (SELECT submission_date, submission_num, hacker_id,
                                    CASE WHEN @sub_date=submission_date THEN @r:=@r+1 ELSE @r:=1 END rowno,
                                    @sub_date:=submission_date sub_date
                        FROM 
                                (SELECT submission_date, COUNT(*) submission_num, hacker_id
                                FROM Submissions
                                GROUP BY submission_date, hacker_id) sub_count
                        ORDER BY submission_date, submission_num DESC, hacker_id) sub_desc
                WHERE rowno =1) max_hacker_sub
        ON  Hackers.hacker_id = max_hacker_sub.hacker_id
    JOIN
                (SELECT submission_date, COUNT(hacker_id) submission_count
                    FROM 
                            (SELECT sub_date.submission_date, hacker_sub.hacker_id, COUNT(hacker_sub.submission_date) hacker_date_count
                            FROM 
                                    (SELECT submission_date,hacker_id
                                    FROM Submissions
                                    GROUP BY submission_date, hacker_id) hacker_sub,
                                    (SELECT submission_date
                                    FROM Submissions
                                    GROUP BY submission_date) sub_date
                            WHERE hacker_sub.submission_date<=sub_date.submission_date
                            GROUP BY sub_date.submission_date, hacker_sub.hacker_id) hacker_date_count
                    WHERE DATE_FORMAT(submission_date,'%d') = hacker_date_count
                    GROUP BY submission_date) max_sub
            ON max_hacker_sub.submission_date = max_sub.submission_date
ORDER BY max_sub.submission_date;


--Oracle
SELECT max_sub.submission_date, 
            max_sub.submission_count, 
            Hackers.hacker_id, 
            Hackers.name
FROM Hackers 
    JOIN
                (SELECT submission_date, submission_num, hacker_id
                FROM
                        (SELECT submission_date, submission_num, hacker_id,
                                    ROW_NUMBER() OVER (PARTITION BY submission_date ORDER BY submission_num DESC, hacker_id) rowno
                        FROM 
                                (SELECT submission_date, COUNT(*) submission_num, hacker_id
                                FROM Submissions
                                GROUP BY submission_date, hacker_id) sub_count
                        ORDER BY submission_date, submission_num DESC, hacker_id) sub_desc
                WHERE rowno =1) max_hacker_sub
        ON  Hackers.hacker_id = max_hacker_sub.hacker_id
    JOIN
                (SELECT submission_date, COUNT(hacker_id) submission_count
                    FROM 
                            (SELECT sub_date.submission_date, hacker_sub.hacker_id, COUNT(hacker_sub.submission_date) hacker_date_count
                            FROM 
                                    (SELECT submission_date,hacker_id
                                    FROM Submissions
                                    GROUP BY submission_date, hacker_id) hacker_sub,
                                    (SELECT submission_date
                                    FROM Submissions
                                    GROUP BY submission_date) sub_date
                            WHERE hacker_sub.submission_date<=sub_date.submission_date
                            GROUP BY sub_date.submission_date, hacker_sub.hacker_id) hacker_date_count
                    WHERE TO_CHAR(submission_date,'DD') = hacker_date_count
                    GROUP BY submission_date) max_sub
            ON max_hacker_sub.submission_date = max_sub.submission_date
ORDER BY max_sub.submission_date;