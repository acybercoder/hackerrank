package hackerrank.regex.applications.ip_address_validation;

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
    		
    		String zeroTo255 = "([0-9]|[0-9][0-9]|(0|1)[0-9][0-9]|2[0-5][0-5])";
    		String ipV4Pattern = "^("+zeroTo255+"\\.){3}"+zeroTo255+"$";
    		Pattern p = Pattern.compile(ipV4Pattern);
            Matcher m = p.matcher(s);
            if(m.find()) {
            	System.out.println("IPv4");
            } else {
            	
            	String group = "([a-f0-9]{4}|[a-f0-9]{0,3})";
            	String ipV6Pattern = "^("+group+":){7}"+group+"$";
            	p = Pattern.compile(ipV6Pattern);
            	m = p.matcher(s);
            	if(m.find()) {
            		System.out.println("IPv6");
            	} else {
            		System.out.println("Neither");
            	}
            }
    	}
    }
}