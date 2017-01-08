"""
Task

You are given a two lists A and B. Your task is to compute their cartesian product AXB.

Example

A = [1, 2]
B = [3, 4]

AxB = [(1, 3), (1, 4), (2, 3), (2, 4)]
Note: A and B are sorted lists, and the cartesian product's tuples should be output in sorted order.

Input Format

The first line contains the space separated elements of list A. 
The second line contains the space separated elements of list B.

Both lists have no duplicate integer elements.

Constraints

Output Format

Output the space separated tuples of the cartesian product.
"""

from itertools import product
print(*product(map(int,input().split()),map(int,input().split())))