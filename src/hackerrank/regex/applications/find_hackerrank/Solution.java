package hackerrank.regex.applications.find_hackerrank;

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
    		Pattern p = Pattern.compile("^(hackerrank|hackerrank[.]*hackerrank)$");
            Matcher m = p.matcher(s);
            if(m.find()) {
            	System.out.println(0);
            	continue;
            }
            
            p = Pattern.compile("^hackerrank");
            m = p.matcher(s);
            if(m.find()) {
            	System.out.println(1);
            	continue;
            }
            
            p = Pattern.compile("hackerrank$");
            m = p.matcher(s);
            if(m.find()) {
            	System.out.println(2);
            	continue;
            }
            
            System.out.println(-1);
    	}
    }
}
