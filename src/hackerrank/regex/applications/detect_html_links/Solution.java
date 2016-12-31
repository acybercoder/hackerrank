package hackerrank.regex.applications.detect_html_links;

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
    	Pattern p = Pattern.compile("<a [^<>]*href=\"(.*?)\"[^<>]*>((<[^<>]+>)*?([^<>]*)(</[^<>]+>)*?)</a>", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(s);
        while(m.find()) {
            System.out.println(m.group(1).trim()+","+m.group(4).trim());
            //System.out.println("========="+m.group(0));
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
