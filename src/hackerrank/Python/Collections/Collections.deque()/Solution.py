"""
Task

Perform append, pop, popleft and appendleft methods on an empty deque d.

Input Format

The first line contains an integer N, the number of operations. 
The next N lines contains the space separated names of methods and their values.

Constraints


Output Format

Print the space separated elements of deque d.
"""
from collections import deque
d = deque()
for _ in range(int(input())):
    eval('d.{0}({1})'.format(*(input().split()+[''])))
print(*d)