package hackerrank.java.strings.java_string_compare;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
        String s = in.next();
        int k = in.nextInt();
        in.close();
        
        List<String> subList = new ArrayList<String>();  
        for(int i=0; i<=s.length()-k; i++ ){
        	subList.add(s.substring(i, k+i));
        }

        Collections.sort(subList);

        System.out.println(subList.get(0));
        System.out.println(subList.get(subList.size()-1));
    }
}