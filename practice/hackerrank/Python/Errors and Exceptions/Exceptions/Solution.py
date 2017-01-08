"""
Task

You are given two values a and b. 
Perform integer division and print a/b.

Input Format

The first line contains T, the number of test cases. 
The next T lines each contain the space separated values of a and b.

Constraints

Output Format

Print the value of a/b. 
In the case of ZeroDivisionError or ValueError, print the error code.
"""
for _ in range(int(input())):
    try:
        a, b = input().split()
        print(int(a)//int(b))
    except Exception as e:
        print('Error Code:', e)
