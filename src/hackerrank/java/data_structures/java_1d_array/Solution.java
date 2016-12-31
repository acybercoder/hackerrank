package hackerrank.java.data_structures.java_1d_array;

import java.util.*;
 
public class Solution {

    public static void main(String[] args) {
	   
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // Declare array a here
        int[] a = new int[n];
        for(int i = 0 ; i < n; i++){
            int val = in.nextInt();
            // Fill array a here
            a[i] = val;
        }
        
        in.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
