"""
CSS colors are defined using a hexadecimal (HEX) notation for the combination of Red, Green, and Blue color values (RGB).

Specifications of HEX Color Code

¡ö It must start with a '#' symbol.
¡ö It can have 3 or 6 digits.
¡ö Each digit is in the range of 0 to F.
¡ö A-F letters can be lower case.

You are given N lines of CSS code. Your task is to print all valid Hex Color Codes, in order of their occurrence from top to bottom.

CSS Code Pattern

Selector
{
    Property: Value;
}
Input Format

The first line contains N, the number of code lines.
The next N lines contains CSS Codes.

Constraints



Output Format

Output the color codes with '#' symbols on separate lines.
"""
import re, sys
[print(e) for s in sys.stdin for e in re.findall('.(#[a-f0-9]{6}|#[a-f0-9]{3})', s, re.I)]
