"""
Task

You are given a date. Your task is to find what the day is on that date.

Input Format

A single line of input containing the space separated month, day and year, respectively, in MM DD YYYY format.

Constraints
2000<Year<3000
Output Format

Output the correct day in capital letters.
"""

import calendar

m, d, y = map(int, input().split())
print(calendar.day_name[calendar.weekday(y, m, d)].upper())