"""
There is an array of  integers. There are also  disjoint sets,  and , each containing  integers. You like all the integers in set  and dislike all the integers in set . Your initial happiness is . For each integer in the array, if , you add  to your happiness. If , you add  to your happiness. Otherwise, your happiness does not change. Output your final happiness at the end.
Note: Since  and  are sets, they have no repeated elements. However, the array might contain duplicate elements.

Constraints 
 
Input Format

The first line contains integers  and  separated by a space. 
The second line contains  integers, the elements of the array. 
The third and fourth lines contain  integers,  and , respectively.

Output Format

Output a single integer, your total happiness.

"""

input().split()
arr = list(map(int, input().split()))
set_a = set(map(int, input().split()))
set_b = set(map(int, input().split()))

print(sum([1 if (n in set_a) else 0 - 1 if (n in set_b) else 0 for n in arr]))