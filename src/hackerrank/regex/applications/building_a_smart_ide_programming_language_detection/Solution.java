package hackerrank.regex.applications.building_a_smart_ide_programming_language_detection;

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
		Pattern p = Pattern.compile("\\s[Cc]\\s|#include");
        Matcher m = p.matcher(s);
        if(m.find()) {
        	System.out.println("C");
        	return;
        } 
        
        p = Pattern.compile("\\s[Jj][Aa][Vv][Aa](.|\\s)");
        m = p.matcher(s);
        if(m.find()) {
        	System.out.println("Java");
        	return;
        } 
        
        p = Pattern.compile("\\sprint[\\(|\\s]");
        m = p.matcher(s);
        if(m.find()) {
        	System.out.println("Python");
        	return;
        } 
    }
    
    static String readStrings(Scanner in) {
    	
		StringBuilder sb = new StringBuilder();
		while(in.hasNextLine()) {
			sb.append(in.nextLine()).append(System.getProperty("line.separator"));
		}
		return sb.toString();
	}
}
