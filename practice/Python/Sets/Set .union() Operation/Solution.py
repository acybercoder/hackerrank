"""
Task
The students of District College have subscriptions to English and French newspapers. Some students have subscribed only to English, some have subscribed to only French and some have subscribed to both newspapers.

You are given two sets of student roll numbers. One set has subscribed to the English newspaper, and the other set is subscribed to the French newspaper. The same student could be in both sets. Your task is to find the total number of students who have subscribed to at least one newspaper.

Input Format

The first line contains an integer, n, the number of students who have subscribed to the English newspaper. 
The second line contains n space separated roll numbers of those students. 
The third line contains b, the number of students who have subscribed to the French newspaper. 
The fourth line contains b space separated roll numbers of those students.

Constraints


Output Format

Output the total number of students who have at least one subscription.
"""
input()
s = set(input().split())
input()
print(len(s|set(input().split())))