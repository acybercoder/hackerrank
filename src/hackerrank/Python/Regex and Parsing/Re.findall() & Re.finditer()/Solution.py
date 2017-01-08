"""
Task 
You are given a string S. It consists of alphanumeric characters, spaces and symbols(+,-). 
Your task is to find all the substrings of S that contains 2 or more vowels. 
Also, these substrings must lie in between 2 consonants and should contain vowels only.

Note : 
Vowels are defined as: AEIOU and aeiou. 
Consonants are defined as: QWRTYPSDFGHJKLZXCVBNM and qwrtypsdfghjklzxcvbnm.

Input Format

A single line of input containing string S.

Constraints


Output Format

Print the matched substrings in their order of occurrence on separate lines. 
If no match is found, print -1.
"""
import re

vowels = 'aeiou'
consonants = 'qwrtypsdfghjklzxcvbnm'
l = re.findall('(?<=['+consonants+'])['+ vowels +']{2,}(?=['+ consonants +'])', input(), re.I)
print('\n'.join(l or ['-1']))
