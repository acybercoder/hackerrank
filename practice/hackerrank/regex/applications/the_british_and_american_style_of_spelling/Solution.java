package hackerrank.regex.applications.the_british_and_american_style_of_spelling;

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
    	String s = readStrings(in, n);
    	
    	int t = Integer.valueOf(in.nextLine());
    	for(int i=0; i<t; i++) {
    		String q = in.nextLine();
    		q = "(" + q + "|" + q.substring(0, q.length()-2)+ "se"+")";
    		Pattern p = Pattern.compile("(?<=\\s)"+q+"(?=\\s)");
            Matcher m = p.matcher(s);
            int count = 0;
            while(m.find()) {
            	count++;
            }
            System.out.println(count);
        }
        in.close();
    }
    
    static String readStrings(Scanner in, int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(in.nextLine()).append(System.getProperty("line.separator"));
		}
		return sb.toString();
	}
}
