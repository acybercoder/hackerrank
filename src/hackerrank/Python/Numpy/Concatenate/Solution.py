"""
Task

You are given two integer arrays of size NXP and MXP (N & M are rows, and P is the column). Your task is to concatenate the arrays along axis .

Input Format

The first line contains space separated integers N, M and P. 
The next N lines contains the space separated elements of the P columns. 
After that, the next N lines contains the space separated elements of the P columns.

Output Format

Print the concatenated array of size (N + M)XP.
"""

import numpy

n, m, _ = map(int, input().split())
array_1, array_2 = map(lambda x:numpy.array([input().split() for _ in range(x)], int), [n, m])

print(numpy.concatenate((array_1, array_2), axis = 0))