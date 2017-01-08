"""
You are given N mobile numbers. Sort them in ascending order then print them in the standard format shown below:


+91 xxxxx xxxxx

The given mobile numbers may have +91, 91 or 0 written before the actual 10 digit number. Alternatively, there may not be any prefix at all. 

Input Format

The first line of input contains an integer N, the number of mobile phone numbers. 
N lines follow each containing a mobile number.

Output Format

Print N mobile numbers on separate lines in the required format.
"""

def wrapper(f):
    def fun(l):
        # complete the function
        l = ['+91'+ ' ' +s[-10:-5]+ ' ' +s[-5:] for s in l]
        return f(l)
    return fun

@wrapper
def sort_phone(l):
    print(*sorted(l), sep='\n')

if __name__ == '__main__':
    l = [input() for _ in range(int(input()))]
    sort_phone(l) 
