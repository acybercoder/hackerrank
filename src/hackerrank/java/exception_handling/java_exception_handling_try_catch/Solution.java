package hackerrank.java.exception_handling.java_exception_handling_try_catch;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner scan = new Scanner(System.in);
    	
    	try {
    		int x = scan.nextInt();
    		int y = scan.nextInt();
    		scan.close();
    		System.out.print(x/y);
    	} 
    	catch (InputMismatchException e) {
    		System.out.print(e.getClass().getName());
    	}
    	catch (Exception e) {
    		System.out.print(e);
    	}
    	
    }
}
