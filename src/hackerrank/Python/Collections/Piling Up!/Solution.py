"""
There is a horizontal row of n cubes. The length of each cube is given. You need to create a new vertical pile of cubes. 
The new pile should follow these directions: if cubei is on top of cubej then sideLengthj >= sideLengthi.

When stacking the cubes, you can only pick up either the leftmost or the rightmost cube each time. Print "Yes" if it is possible to stack the cubes. Otherwise, print "No". Do not print the quotation marks.

Input Format

The first line contains a single integer T, the number of test cases. 
For each test case, there are 2 lines. 
The first line of each test case contains n, the number of cubes. 
The second line contains n space separated integers, denoting the sideLengths of each cube in that order.

Constraints 
 
Output Format

For each test case, output a single line containing either "Yes" or "No" without the quotes.
"""
from collections import deque

from collections import deque

for _ in range(int(input())):
    _, d = input(), deque(map(int, input().split()))
    top = d[0]
    while(len(d) and top>=d[0]):
        top = d[0]; d.popleft()
    while(len(d) and top<=d[0]):
        top = d[0]; d.popleft()
    print("No" if len(d) else "Yes")
"""
#solution without deque
for _ in range(int(input())):
    _, sideLengths = input(), list(map(int, input().split()))
    l = len(sideLengths)
    i = 0
    while i < l - 1 and sideLengths[i] >= sideLengths[i+1]:
        i += 1
    while i < l - 1 and sideLengths[i] <= sideLengths[i+1]:
        i += 1
    print("Yes" if i == l - 1 else "No")
"""