"""
Task 
You are given a string S. 
Your task is to find the indices of the start and end of string k in S.

Input Format

The first line contains the string S. 
The second line contains the string k.

Constraints

Output Format

Print the tuple in this format: (start _index, end _index). 
If no match is found, print (-1, -1).
"""
import re

s, k = input(), input()
print(*[(m.start(1), m.end(1)-1) for m in re.finditer('(?=('+k+'))', s)] or [(-1,-1)], sep='\n')
"""
p = re.compile(k)
m = p.search(s)

if not m: print("(-1, -1)")
while m:
    print("({0}, {1})".format(m.start(), m.end() - 1))
    m = p.search(s,m.start() + 1)
"""