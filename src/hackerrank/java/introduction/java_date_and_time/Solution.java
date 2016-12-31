package hackerrank.java.introduction.java_date_and_time;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        //
        in.close();
        
        Calendar cal = Calendar.getInstance();
        cal.setTimeZone(TimeZone.getDefault());
        cal.set(Integer.parseInt(year), Integer.parseInt(month)-1, Integer.parseInt(day));
        //String[] week = {"MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY","SUNDAY"};
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(Calendar.MONDAY, "MONDAY");
        map.put(Calendar.TUESDAY, "TUESDAY");
        map.put(Calendar.WEDNESDAY, "WEDNESDAY");
        map.put(Calendar.THURSDAY, "THURSDAY");
        map.put(Calendar.FRIDAY, "FRIDAY");
        map.put(Calendar.SATURDAY, "SATURDAY");
        map.put(Calendar.SUNDAY, "SUNDAY");
        System.out.println(map.get(cal.get(Calendar.DAY_OF_WEEK)));
        
    }
}
