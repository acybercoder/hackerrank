"""
Task

You are given two arrays (A & B) of dimensions NXM. 
Your task is to perform the following operations:

Add (A + B)
Subtract (A - B)
Multiply (A * B)
Divide (A / B)
Mod (A % B)
Power (A ** B)
Input Format

The first line contains two space separated integers, N and M. 
The next N lines contains M space separated integers of array A. 
The following N lines contains M space separated integers of array B.

Output Format

Print the result of each operation in the given order under Task.
"""
import numpy

n, _ = map(int, input().split())

a, b = (numpy.array([input().split() for _ in range(n)], int) for _ in range(2))
print(a+b, a-b, a*b, a//b, a%b, a**b, sep='\n')
