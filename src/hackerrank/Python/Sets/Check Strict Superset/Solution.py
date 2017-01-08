"""
You are given one set A and a number of other sets, N. 
Your job is to find whether set A is a strict superset of all the N sets. 
Print True, if A is a strict superset of all of the N sets. Otherwise, print False.

A strict superset has at least one element that does not exist in its subset.

Example: 
Set is a strict superset of set.
Set is not a strict superset of set.
Set is not a strict superset of set.

Input Format

The first line contains the space separated elements of set A.
The second line contains integer N, the number of other sets.
The next N lines contains the space separated elements of the other sets.

Constraints

Output Format

Print True if set  is a strict superset of all other  sets. Otherwise, print False.
"""
s = set(input().split())
print(all(s>set(input().split()) for _ in range(int(input()))))