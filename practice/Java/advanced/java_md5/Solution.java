package hackerrank.java.advanced.java_md5;

import java.io.*;
import java.util.*;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(md5(str));
    
    }
    
    static String md5(String s) {
    	 if(s == null || s.length() == 0)  
             return null;  
         MessageDigest MD5 = null;  
         try{  
             MD5 = MessageDigest.getInstance("md5");  
         }catch(NoSuchAlgorithmException e){  
             e.printStackTrace();  
             return null;  
         }  
   
         byte[] bytes = MD5.digest(s.getBytes());  
         StringBuilder res = new StringBuilder();  
         for(byte b : bytes){  
             String hex = Integer.toHexString(b & 0xff);  
             if(hex.length() == 1){  
                 hex = "0" + hex;  
             }  
             res.append(hex);  
         }  
         return res.toString();  
	 }
}