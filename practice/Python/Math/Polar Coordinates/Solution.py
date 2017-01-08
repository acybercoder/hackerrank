"""
Task 
You are given a complex z. Your task is to convert it to polar coordinates.

Input Format

A single line containing the complex number z.

Output Format

Output two lines: 
The first line should contain the value of r. 
The second line should contain the value of бщ.
"""
import cmath
print(*cmath.polar(complex(input())), sep='\n')