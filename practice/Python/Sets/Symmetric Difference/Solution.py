"""
Task 
Given 2 sets of integers, M and N, print their symmetric difference in ascending order. 
The term symmetric difference indicates those values that exist in either M or N but do not exist in both.

Input Format

The first line of input contains an integer, M. 
The second line contains M space-separated integers. 
The third line contains an integer, N. 
The fourth line contains N space-separated integers.

Output Format

Output the symmetric difference integers in ascending order, one per line.
"""
int(input())
set_m = set(input().split())
int(input())
set_n = set(input().split())

print('n'.join(sorted(set_n.symmetric_difference(set_m), key=int)))
