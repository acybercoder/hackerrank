package hackerrank.java.data_structures.java_1d_array_part_2;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
        	int n = in.nextInt();
        	int m = in.nextInt();
        	int[] a = new int[n];
        	for(int i=0; i<n; i++) {
        		a[i] = in.nextInt();
        	}
        	//
        	System.out.println(isPossbile(a, 0, m)?"YES":"NO");
        }
        in.close();
    }
    static boolean isPossbile(int[] arr, int i, int m) {
    	if(i<0||arr[i]==1) return false;
    	if(i==arr.length-1 || i+m>arr.length-1) return true;
    	arr[i] = 1;
    	return isPossbile(arr, i-1, m) 
    			|| isPossbile(arr, i+1, m) 
    			|| isPossbile(arr, i+m, m);
    }
}
