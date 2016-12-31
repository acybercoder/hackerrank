package hackerrank.java.data_structures.java_priority_queue;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Student{
   private int token;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.token = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getToken() {
      return token;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
}

public class Solution {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int totalEvents = Integer.parseInt(in.nextLine());
      
      List<Student> students = new ArrayList<Student>();
      while(totalEvents>0){
         String event = in.next();
         
         //Complete your code
         if("ENTER".equals(event)) {
        	 String name = in.next();
        	 double cgpa = in.nextDouble();
        	 int token = in.nextInt();
        	 students.add(new Student(token, name, cgpa));
         }
         
         if("SERVED".equals(event)) {
        	 if(students.size()>0) {
        		 Collections.sort(students, new Comparator<Student>() {

					@Override
					public int compare(Student o1, Student o2) {
						if(o1.getCgpa()!=o2.getCgpa()) {
							if(o2.getCgpa()>o1.getCgpa()) return 1;
							else return -1;
						}
						if(!o1.getFname().equals(o2.getFname())) 
							return o1.getFname().compareTo(o2.getFname());
						return o1.getToken()-o2.getToken();
					}
        			 
        		 });
        		 students.remove(0); 
        	 }
        	 
         }
           //Complete your code
           
         totalEvents--;
      }
      
      if(students.size()==0)
    	  System.out.println("EMPTY");
      else
    	  for(Student s: students) {
    		  System.out.println(s.getFname());
    	  }
      in.close();
    }
}

