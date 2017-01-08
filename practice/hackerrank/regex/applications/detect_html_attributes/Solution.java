package hackerrank.regex.applications.detect_html_attributes;

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
    	//tag
    	Pattern tp = Pattern.compile("<\\s*(\\w+)[^><]*>");
        Matcher tm = tp.matcher(s);
        Map<String, Set<String>> attrib = new TreeMap<String, Set<String>>();
        while(tm.find()) {
            if(!attrib.containsKey(tm.group(1)))
    			attrib.put(tm.group(1), new TreeSet<String>());
        	Pattern ap = Pattern.compile("(\\w+)\\s*=(\"[^\"]*\"|'[^']*')+");
        	Matcher am = ap.matcher(tm.group(0));
        	while(am.find()) {
            	attrib.get(tm.group(1)).add(am.group(1));
            }
        }
        for(String key:attrib.keySet()) {
        	System.out.print(key + ":");
        	if(attrib.get(key).size()==0) {
        		System.out.println();
        		continue;
        	}
        	
        	for(int i=0; i<attrib.get(key).size()-1; i++) {
                System.out.print(attrib.get(key).toArray()[i]+",");
        	}
        	System.out.println(attrib.get(key).toArray()[attrib.get(key).size()-1]);
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