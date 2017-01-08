"""
Task

Your task is to print an array of size N and integer type using the tools zeros and ones.N  is the space separated list of the dimensions of the array.

Input Format

A single line containing the space separated list of N.

Output Format

First, print the array using the zeros tool and then print the array with the ones tool.
"""

import numpy

n = tuple(map(int, input().split()))
print(numpy.zeros(n, int))
print(numpy.ones(n, int))