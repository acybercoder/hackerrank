"""
TASK
You are given a set  and  number of other sets. These  number of sets have to perform some specific mutation operations on set .

Your task is to execute those operations and print the sum of elements from set .

Input Format

The first line contains the number of elements in set .
The second line contains the space separated list of elements in set .
The third line contains integer , the number of other sets.
The next 2 * N lines are divided into  parts containing two lines each.
The first line of each part contains the space separated entries of the operation name and the length of the other set.
The second line of each part contains space separated list of elements in the other set.

 len(set(A))  
 len(otherSets)  

Output Format

Output the sum of elements in set .
"""
input()
s = set(input().split())
[eval('s.{0}({1})'.format(input().split()[0], set(input().split()))) for _ in range(int(input()))]
print(sum(map(int, s)))