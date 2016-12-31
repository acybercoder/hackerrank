package hackerrank.regex.applications.find_a_sub_word;

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
    	int k = Integer.valueOf(in.nextLine());
    	for(int i=0; i<k; i++) {
    		String q = in.nextLine();
    		Pattern p = Pattern.compile("\\w+("+q+")\\w+");
            Matcher m = p.matcher(s);
            int count=0;
            while(m.find()) {
            	count++;
            }
            System.out.println(count);
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
