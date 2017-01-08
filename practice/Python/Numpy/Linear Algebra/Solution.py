"""
Task

You are given a square matrix A with dimensions NXN. Your task is to find the determinant.

Input Format

The first line contains the integer N. 
The next N lines contains the N space separated elements of array A.

Output Format

Print the determinant of A.
"""

import numpy

print (numpy.linalg.det(numpy.array([input().split() for i in range(int(input()))], float)))