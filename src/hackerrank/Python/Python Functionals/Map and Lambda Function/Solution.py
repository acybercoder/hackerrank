"""
Input Format

One line of input: an integer N.

Constraints

Output Format

A list on a single line containing the cubes of the first N fibonacci numbers.
"""

cube = lambda x: x**3# complete the lambda function 

def fibonacci(n):
    # return a list of fibonacci numbers
    fib = lambda n: n if n < 2 else fib(n - 1) + fib(n - 2)
    return map(fib, range(n))
    
if __name__ == '__main__':
    n = int(input())
    print(list(map(cube, fibonacci(n))))