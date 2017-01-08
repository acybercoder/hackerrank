"""
A postal code P must be a number in the range of (100000 - 999999). 
A postal code P must not contain more than one alternating repetitive digit pair. 

Alternating repetitive digits are digits which repeat immediately after the next digit. In other words, an alternating repetitive digit pair is formed by two equal digits that have just a single digit between them.

For example:

121426 # Here, 1 is an alternating repetitive digit.
523563 # Here, NO digit is an alternating repetitive digit.
552523 # Here, both 2 and 5 are alternating repetitive digits.
Your task is to validate whether P is a valid postal code or not.

Input Format

One single line of input containing the string P.

Output Format

Print "True" if P is valid. Otherwise, print "False". Do not print the quotation marks.
"""

import re

s = input()
print(bool(re.search(r'^[1-9][\d]{5}$',s)) and not bool(re.search(r'(.)(?=.\1).*(.).\2', s)))
