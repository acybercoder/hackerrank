package hackerrank.regex.applications.detecting_valid_latitude_and_longitude_pairs;

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
    		String xPattern = "[+-]?(([1-8]?\\d(\\.\\d+)*)|(90(\\.0+)?))";
    		String yPattern = "[+-]?((((1[0-7]|[1-9])?\\d)(\\.\\d+)*)|(180(\\.0+)?))";
    		Pattern p = Pattern.compile("^\\("+ xPattern +", " + yPattern+ "\\)$");
            Matcher m = p.matcher(s);
            if(m.find()) {
            	System.out.println("Valid");
            } else 
            	System.out.println("Invalid");
            
    	}
    }
}