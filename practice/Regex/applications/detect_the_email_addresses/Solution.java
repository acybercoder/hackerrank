package hackerrank.regex.applications.detect_the_email_addresses;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
    	String s = readStrings(in);
    	in.close();
		Pattern p = Pattern.compile("(\\w+[.?\\w*]*@\\w+(\\.[a-zA-B]+)+)",Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(s);
        
        SortedSet<String> set = new TreeSet<String>();
        while(m.find()) {
            set.add(m.group(1));
        } 
        
        System.out.println(stringJoin(";", set));
    }
    
    static String stringJoin(String seperator, Collection collection) {
    	
		if(collection.size() == 0) return "";
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<collection.size()-1; i++) {
            sb.append(collection.toArray()[i]).append(seperator);
		}
		sb.append(collection.toArray()[collection.size()-1]);
		return sb.toString();
	}

    static String readStrings(Scanner in) {
    	
		StringBuilder sb = new StringBuilder();
		while(in.hasNextLine()) {
			sb.append(in.nextLine()).append(System.getProperty("line.separator"));
		}
		return sb.toString();
	}
}
