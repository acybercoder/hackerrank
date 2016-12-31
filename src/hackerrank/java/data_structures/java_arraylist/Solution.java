package hackerrank.java.data_structures.java_arraylist;

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
    	List<List<Integer>> list_2d = new ArrayList<List<Integer>>(); 
    	while(n-->0) {
    		int d = in.nextInt();
    		List<Integer> list = new ArrayList<Integer>();
    		while(d-->0) {
    			list.add(in.nextInt());
    		}
    		list_2d.add(list);
    	}
    	int q = in.nextInt();
    	while(q-->0) {
    		int x = in.nextInt();
    		int y = in.nextInt();
    		try {
    			System.out.println(list_2d.get(x-1).get(y-1));
    		} catch (Exception e) {
    			System.out.println("ERROR!");
    		}
    	}
    }
}