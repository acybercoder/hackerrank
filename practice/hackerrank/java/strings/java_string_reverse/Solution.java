package hackerrank.java.strings.java_string_reverse;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        sc.close();
        
        boolean palindrome = true;
        for(int i=0; i<A.length()/2; i++) {
        	if(A.charAt(i)!=A.charAt(A.length()-1-i)) {
        		palindrome = false;
        		break;
        	}
        }
        System.out.println(palindrome?"Yes":"No");
    }
}
