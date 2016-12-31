package hackerrank.java.bignumber.java_biginteger;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
    	String sa = in.next();
    	String sb = in.next();
    	in.close();
    	
    	BigInteger a = new BigInteger(sa);
    	BigInteger b = new BigInteger(sb);
    	
    	System.out.println(a.add(b));
    	System.out.println(a.multiply(b));
    }
}