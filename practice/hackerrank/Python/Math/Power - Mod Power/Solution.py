"""
Task 
You are given three integers: a, b, and m, respectively. Print two lines. 
The first line should print the result of pow(a,b). The second line should print the result of pow(a,b,m).

Input Format 
The first line contains a, the second line contains b, and the third line contains .
"""

a,b,m = [int(input()) for _ in range(3)]
print(pow(a,b),pow(a,b,m),sep='\n')