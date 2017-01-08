"""
Task

You are given a string S. 
Your task is to print all possible size k replacement combinations of the string in lexicographic sorted order.

Input Format

A single line containing the string S and integer value k separated by a space.

Constraints

 
The string contains only UPPERCASE characters.

Output Format

Print the combinations with their replacements of string S on separate lines.    
"""

from itertools import combinations_with_replacement
s, k = input().split()
print(*[''.join(c) for c in combinations_with_replacement(sorted(s), int(k))], sep='\n')