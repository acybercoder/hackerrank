"""
Task 
Given 2 timestamps, print the absolute difference (in seconds) between them.

Input Format 
The first line contains T, the number of testcases. 
Each testcase contains 2 lines, representing time t1 and t2 time .

Output Format 
Print the absolute difference (t1 - t2) in seconds.

Constraints 
It is guaranteed that the input contains only valid timestamps, and the year can reach up to 3000.
"""
from datetime import datetime

FMT = '%a %d %b %Y %H:%M:%S %z'
for _ in range(int(input())):
    print(int(abs((datetime.strptime(input(), FMT) - datetime.strptime(input(), FMT)).total_seconds())))