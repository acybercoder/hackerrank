package hackerrank.java.data_structures.java_map;

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
 public static void main(String []argh)
 {
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    in.nextLine();
    
    Map<String, String> map = new HashMap<String, String>();
    for(int i=0;i<n;i++)
    {
       String name=in.nextLine();
       int phone=in.nextInt();
       in.nextLine();
       map.put(name, String.valueOf(phone));
    }
    while(in.hasNext())
    {
       String s=in.nextLine();
       String phone = map.get(s);
       
       System.out.println(phone==null?"Not found":s+"="+phone);
    }
 }
}
