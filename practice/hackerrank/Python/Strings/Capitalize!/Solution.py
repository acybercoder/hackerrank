"""
You are given a string . Your task is to capitalize each word of .

Input Format

A single line of input containing the string, .

Constraints


The string consists of alphanumeric characters and spaces.

Output Format

Print the capitalized string, .

Sample Input

hello world
Sample Output

Hello World
"""

def capitalize(string):
    for x in string.split():
        string = string.replace(x, x.capitalize())
    return string

if __name__ == '__main__':
    string = input()
    capitalized_string = capitalize(string)
    print(capitalized_string)