"""
Task

You are given an HTML code snippet of N lines. 
Your task is to print the single-line comments, multi-line comments and the data.

Print the result in the following format:

>>> Single-line Comment  
Comment
>>> Data                 
My Data
>>> Multi-line Comment  
Comment_multiline[0]
Comment_multiline[1]
>>> Data
My Data
>>> Single-line Comment:  
Note: Do not print data if data == '\n'.

Input Format

The first line contains integer N, the number of lines in the HTML code snippet.
The next N lines contains HTML code.

Constraints


Output Format

Print the single-line comments, multi-line comments and the data in order of their occurrence from top to bottom in the snippet.

Format the answers as explained in the problem statement.
"""

from html.parser import HTMLParser

class MyHTMLParser(HTMLParser):
    def handle_comment(self, data):
        print('>>> Multi-line Comment' if ('\n' in data) else '>>> Single-line Comment', data, sep='\n')
    def handle_data(self, data): 
        print('>>> Data', data, sep='\n')  if data.strip() else None
  
  
html = ""       
for i in range(int(input())):
    html += input().rstrip()
    html += '\n'
    
parser = MyHTMLParser()
parser.feed(html)
parser.close()
