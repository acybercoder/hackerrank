"""
You are given data in a tabular format. The data contains 

rows, and each row contains 

space separated elements. 
You can imagine the 

items to be different attributes, (like height, weight, energy, etc.) and each of the 

rows as an instance or a sample. 
Your task is to sort the table on the 

th attribute and print the final resulting table. 
Note: If two attributes are the same for different rows, print the row that appeared first in the input.
Input Format 
The first line contains 

and 

separated by a space. 
The next 

lines each contain 

elements. 
The last line contains 

. 
Constraints 














Each element 


Output Format 
Print the 

lines of the sorted table. Each line should contain the space separated elements. Check the sample below for clarity. 
Sample Input 
5 3
10 2 5
7 1 0
9 9 9
1 23 12
6 5 9
1
Sample Output 
7 1 0
10 2 5
6 5 9
9 9 9
1 23 12
Explanation 
The table is sorted on the second attribute shown as 



because it's 

-indexed. 
"""
n, m = map(int, input().split())
nums = [list(map(int, input().split())) for _ in range(n)]
k = int(input())

nums.sort(key=lambda x: x[k])

for line in nums:
    print(*line)