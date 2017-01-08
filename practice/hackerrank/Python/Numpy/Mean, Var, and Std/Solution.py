"""
Task

You are given a 2-D array of size NXM. 
Your task is to find:

The mean along axis 1
The var along axis 0
The std along axis None

Input Format

The first line contains the space separated values of N and M. 
The next N lines contains M space separated integers.

Output Format

First, print the mean. 
Second, print the var. 
Third, print the std.
"""
import numpy

array = numpy.array([input().split() for _ in range(int(input().split()[0]))], float)
print(numpy.mean(array, axis=1), numpy.var(array, axis=0), numpy.std (array), sep='\n')