"""
Task 
You are given a 1-D array, A. Your task is to print the floor, ceil and rint of all the elements of A.

Input Format

A single line of input containing the space separated elements of array A.

Output Format

On the first line, print the floor of A. 
On the second line, print the ceil of A. 
On the third line, print the rint of A.
"""
import numpy

a = numpy.array(input().split(), float)
print(numpy.floor(a), numpy.ceil(a), numpy.rint(a), sep='\n')