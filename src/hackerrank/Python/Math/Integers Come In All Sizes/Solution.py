"""
Task 
Read four numbers,a, b, c, and d, and print the result of a**b+c**d.

Input Format 
Integers a, b, c, and d are given on four separate lines, respectively.
"""
#print ((int(input())**int(input()))+(int(input())**int(input())))
print(eval('{0}**{1}+{2}**{3}'.format(*[int(input()) for _ in range(4)])))