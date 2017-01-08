package hackerrank.java.data_structures.java_subarray;

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
    	int[] a = new int[n];
    	for(int i=0; i<n; i++) {
    		a[i] = in.nextInt();
    	}
    	in.close();
    	
    	int count = 0;
    	int sum = 0;
    	for(int i=0; i<n; i++) {
    		sum+=a[i];
    		count = sum<0? count++:count;
    		for(int j=i+1; j<n; j++) {
    			sum+=a[j];
    			count = sum<0? count++:count;
    		}
    	}
    	System.out.println(count);
    }
}