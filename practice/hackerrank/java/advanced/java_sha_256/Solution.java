package hackerrank.java.advanced.java_sha_256;

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
        System.out.println(sha256(str));
    }
    
    static String sha256(String s) {
    	if(s == null || s.length() == 0)  
            return null;  
        MessageDigest SHA256 = null;  
        try{  
        	SHA256 = MessageDigest.getInstance("SHA-256");  
        }catch(NoSuchAlgorithmException e){  
            e.printStackTrace();  
            return null;  
        }  
  
        byte[] bytes = SHA256.digest(s.getBytes());  
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