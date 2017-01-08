package hackerrank.java.data_structures.java_list;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        while(n-->0) {
        	list.add(in.nextInt());
        }
        int q = in.nextInt();
        while(q-->0) {
        	String cmd = in.next();
        	int x = in.nextInt();
        	if(cmd.equals("Insert")) {
        		int y = in.nextInt();
        		if(x>list.size())
        			list.add(y);
        		else
        			list.add(x, y);
        	}
        	if(cmd.equals("Delete")) {
        		list.remove(x);
        	}
        }
        in.close();
        
        StringBuffer sb = new StringBuffer();
        for(Integer val : list) {
    		sb.append(val).append(" ");
    	}	
        System.out.println(sb);
    }
    
}
