package hackerrank.java.data_structures.java_2d_array;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
                if(i>1 && j>1) {
                	int sum = 
                			arr[i-2][j-2] + arr[i-2][j-1]+ arr[i-2][j]
                		  + arr[i-1][j-1]
        				  + arr[i][j-2] + arr[i][j-1] + arr[i][j];
                	maxSum = Math.max(maxSum, sum);
                					
                }
            }
        }
        in.close();
        System.out.println(maxSum);
    }
}
