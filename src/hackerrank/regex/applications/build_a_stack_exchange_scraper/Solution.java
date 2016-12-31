package hackerrank.regex.applications.build_a_stack_exchange_scraper;

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
    	
    	//id
    	List<String> id = new ArrayList<String>();
		Pattern p = Pattern.compile("/questions/(\\d+)/");
        Matcher m = p.matcher(s);
        int count=0;
        while(m.find()) {
        	count++;
        	if(null!=m.group(1))
        		id.add(m.group(1));
        	else
        		id.add(m.group(2));
        }
        
        //topic
        List<String> topic = new ArrayList<String>();
        p = Pattern.compile("question-hyperlink\">([^><]+)<");
        m = p.matcher(s);
        count=0;
        while(m.find()) {
        	count++;
        	topic.add(m.group(1));
        }
        
        
        //time
        List<String> time = new ArrayList<String>();
        p = Pattern.compile("relativetime\">([^><]+)<");
        m = p.matcher(s);
        count=0;
        while(m.find()) {
        	count++;
        	time.add(m.group(1));
        }
        
        for(int i=0; i<id.size(); i++) {
        	System.out.println(id.get(i) +";"+topic.get(i)+";"+time.get(i));
        }
        
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
