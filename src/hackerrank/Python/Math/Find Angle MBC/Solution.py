"""
ABC is a right triangle, 90 at B.
Therefore, ABC=90.

Point M is the midpoint of hypotenuse AC.

You are given the lengths AB and AC. 
Your task is to find  (angle , as shown in the figure) in degrees.

Input Format

The first line contains the length of side AB.
The second line contains the length of side BC.

Constraints



Lengths  and  are natural numbers.

Output Format

Output  in degrees. 

Note: Round the angle to the nearest integer. 

Examples:
If angle is 56.5000001бу, then output 57бу.
If angle is 56.5000000бу, then output 57бу.
If angle is 56.4999999бу, then output 56бу.



"""

import math
AB = float(input())
BC = float(input())

print(str(int(round(math.degrees(math.atan2(AB, BC)))))+'бу')