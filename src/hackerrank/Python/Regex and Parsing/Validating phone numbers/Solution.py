"""
You are given some input, and you are required to check whether they are valid mobile numbers.

A valid mobile number is a ten digit number starting with a 7,8 or 9.

Input Format

The first line contains an integer N, the number of inputs.
N lines follow, each containing some string.

Constraints

Output Format

For every string listed, print "YES" if it is a valid mobile number and "NO" if it is not on separate lines. Do not print the quotes.
"""

import re

for _ in range(int(input())):
    print('YES' if re.match('[789]\d{9}$', input()) else 'NO')
        