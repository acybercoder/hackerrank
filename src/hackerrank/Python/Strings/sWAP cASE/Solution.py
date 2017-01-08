"""
You are given a string 

. Your task is to swap cases. In other words, convert all lowercase letters to uppercase letters and vice versa.
For Example:
Www.HackerRank.com ¡ú wWW.hACKERrANK.COM
Pythonist 2 ¡ú pYTHONIST 2
Input Format
A single line containing a string 

.
Constraints 










Output Format
Print the modified string 

.
Sample Input
HackerRank.com presents "Pythonist 2".
Sample Output
hACKERrANK.COM PRESENTS "pYTHONIST 2".
"""

def swap_case(s):
    return s.swapcase()

if __name__ == '__main__':
    s = input()
    result = swap_case(s)
    print(result)