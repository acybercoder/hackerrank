"""
You are given a function f(X)=X**2.

You are also given K lists. The i th  list consists of Ni elements.

You have to pick exactly one element from each list so that the equation below is maximized: 

S=(f(X1)+f(X2)+...+f(Xk))%M

Xi denotes the element picked from the i th list . Find the maximized value Smax obtained.

% denotes the modulo operator.

Input Format 
The first line contains 2 space separated integers K and M. 
The next K lines each contains an integer Ni followed by Ni space separated integers denoting the elements in the list.

Output Format 
Output a single integer denoting the value Smax.
"""
from itertools import product


k, m = map(int, input().split())
s = [([int(e)**2 for e in input().split()[1:]]) for _ in range(k)]

print(max([sum(e)%m for e in list(product(*s))]))
