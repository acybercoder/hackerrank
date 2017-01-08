"""
Task

You are given two arrays: A and B. 
Your task is to compute their inner and outer product.

Input Format

The first line contains the space separated elements of array A. 
The second line contains the space separated elements of array B.

Output Format

First, print the inner product. 
Second, print the outer product.
"""

import numpy

a = numpy.array(input().split(), int)
b = numpy.array(input().split(), int)

print(numpy.inner(a, b))
print(numpy.outer(a, b))
