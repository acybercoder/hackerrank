package hackerrank.regex.applications.detect_the_domain_name;

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
    	in.close();
    	Pattern p = Pattern.compile("https?://(www.)?((\\w+(-\\w*)*)(\\.[a-zA-Z0-9]+(-[a-zA-Z0-9]*)*)+)/?",Pattern.CASE_INSENSITIVE);
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
    
    static String readStrings(Scanner in, int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(in.nextLine()).append(System.getProperty("line.separator"));
		}
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
