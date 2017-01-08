package hackerrank.regex.applications.alien_username;

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
    		Pattern p = Pattern.compile("^[_.](?<=[0-9])[a-zA-Z]*-?$");
            Matcher m = p.matcher(s);
            if(m.find()) {
            	System.out.println("VALID");
            } else 
            	System.out.println("INVALID");
            
    	}
    }
    
    static String readStrings(Scanner in, int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(in.nextLine()).append(System.getProperty("line.separator"));
		}
		return sb.toString();
	}
}