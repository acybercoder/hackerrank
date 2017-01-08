"""
You are given a string S. 
The string contains only lowercase English alphabet characters.

Your task is to find the top three most common characters in the string S.

Input Format

A single line of input containing the string S.

Constraints


Output Format

Print the three most common characters along with their occurrence count each on a separate line.
Sort output in descending order of occurrence count.
If the occurrence count is the same, sort the characters in ascending order.
"""

from collections import Counter

[print(*item) for item in  sorted(Counter((input())).items(), key=lambda x:(-x[1], x[0]))[:n]]

    
    