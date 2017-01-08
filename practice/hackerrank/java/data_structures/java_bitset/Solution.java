package hackerrank.java.data_structures.java_bitset;

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
    	int m = in.nextInt();
    	
    	BitSet B1=new BitSet(n);
    	BitSet B2=new BitSet(n);
    	while(m-->0) {
    		String op = in.next();
    		int p1 = in.nextInt();
    		int p2 = in.nextInt();
    		
    		if(op.equals("AND")) {
    			if(p1==1) B1.and(B2);
    			else B2.and(B1);
    		}
    		else if(op.equals("OR")) {
    			if(p1==1) B1.or(B2);
    			else B2.or(B1);
    		}
    		else if(op.equals("XOR")) {
    			if(p1==1) B1.xor(B2);
    			else B2.xor(B1);
    		}
    		else if(op.equals("FLIP")) {
    			if(p1==1) B1.flip(p2);
    			else B2.flip(p2);
    		}
    		else if(op.equals("SET")) {
    			if(p1==1) B1.set(p2);
    			else B2.set(p2);
    		}
    		System.out.println(B1.cardinality() + " " + B2.cardinality());	
    	}
    	in.close();
    	
    
    }
}