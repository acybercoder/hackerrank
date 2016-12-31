package hackerrank.regex.applications.utopian_identification_number;

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
    		Pattern p = Pattern.compile("^[a-z]{0,3}[0-9]{2,8}[A-Z]{3,}$");
            Matcher m = p.matcher(s);
            if(m.find()) {
            	System.out.println("VALID");
            } else 
            	System.out.println("INVALID");
            
    	}
    }
}