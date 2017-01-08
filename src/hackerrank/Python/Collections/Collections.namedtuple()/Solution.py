"""
Task

Dr. John Wesley has a spreadsheet containing a list of student's IDs, marks, class and name.

Your task is to help Dr. Wesley calculate the average marks of the students.


Note: 
1. Columns can be in any order. IDs, marks, class and name can be written in any order in the spreadsheet. 
2. Column names are ID, MARKS, CLASS and NAME. (The spelling and case type of these names won't change.)

Input Format

The first line contains an integer N, the total number of students. 
The second line contains the names of the columns in any order. 
The next N lines contains the marks, IDs, name and class, under their respective column names.

Constraints


Output Format

Print the average marks of the list corrected to 2 decimal places.
"""

from collections import namedtuple

#rapid solution
#n, marks = int(input()), input().split().index("MARKS")
#print ('%.2f' %(sum([int(input().split()[marks]) for _ in range(n)]) / n))

#namedtuple
n, spreadsheet = int(input()), namedtuple('spreadsheet', input())
print('%.2f' %(sum([int(spreadsheet(*(input().split())).MARKS) for _ in range(n)])/n))
