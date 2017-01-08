package hackerrank.regex.applications.detect_html_tags;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner Input = new Scanner(System.in);
    	int n = Integer.valueOf(Input.nextLine());
    	Set<String> set = new TreeSet<String>();
    	while(n-->0) {
    		String s = Input.nextLine();
    		//System.out.println(s);
    		Pattern p = Pattern.compile("<\\s*(\\w+)[^<>]*>");
            Matcher m = p.matcher(s);
            while(m.find()) {
            	set.add(m.group(1));
            }
    	}
    	System.out.println(String.join(";", set.toArray(new String[0])));
    }
}