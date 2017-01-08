"""
Task 
You are given a string S, containing , and/or . and 0-9 digits. 
Your task is to re.split() all of the , and . symbols.

Input Format

A single line of input containing the string S.

Output Format

Print the numbers obtained after splitting the string on separate lines.
"""

import re
[print(i) for i in re.split('[.,]', input()) if i]