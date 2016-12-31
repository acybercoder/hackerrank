package hackerrank.regex.applications.saying_hi;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
    	int n = Integer.valueOf(in.nextLine());
    	for(int i=0; i<n; i++) {
    		String s = in.nextLine();
    		Pattern p = Pattern.compile("^[Hh][Ii]\\s[^Dd]");
            Matcher m = p.matcher(s);
            if(m.find()) {
            	System.out.println(s);
            } 
    	}
    }
}
