package hackerrank.regex.applications.split_the_phone_numbers;

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
    		Pattern p = Pattern.compile("^(\\d{1,3})[- ](\\d{1,3})[- ](\\d{4,10})$");
            Matcher m = p.matcher(s);
            if(m.find()) {
            	System.out.println("CountryCode=" + m.group(1) + ",LocalAreaCode=" 
            					+ m.group(2) + ",Number=" + m.group(3));
            } 
            
    	}
    }
}
