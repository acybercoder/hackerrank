package hackerrank.java.strings.java_anagrams;

import java.io.*;
import java.util.*;

public class Solution {
	
	static boolean isAnagram(String a, String b) {
        // Complete the function by writing your code here.
		char[] chA = a.toLowerCase().toCharArray(), chB = b.toLowerCase().toCharArray(); 
		if(chA.length!=chB.length) return false;
		
		Arrays.sort(chA);Arrays.sort(chB);
		
		return Arrays.equals(chA, chB);
    }

	public static void main(String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
	    String a = scan.next();
	    String b = scan.next();
	    scan.close();
	    boolean ret = isAnagram(a, b);
	    System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}
}