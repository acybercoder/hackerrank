package hackerrank.java.object_oriented_programming.calculating_volume;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import java.security.Permission;

class Output {
	void display(double num) {
		System.out.println(String.format("%.3f", num));
	}
}
class Calculate {
	private Scanner in;
	private static Calculate self;
	Output output;
	Calculate() {
		in = new Scanner(System.in);
		output = new Output();
	}
	int get_int_val() throws IOException {
		int n = in.nextInt();
		if(n<=0) throw new NumberFormatException("All the values must be positive");
		return n;
	}
	
	double get_double_val() throws IOException{
		double n = in.nextDouble();
		if(n<=0) throw new NumberFormatException("All the values must be positive");
		return n;
	}
	
	static Calculate do_calc() {
		if(self==null)
			self = new Calculate();
		return self;
	}
	
	double get_volume(int a) {
		return a * a * a;
	}
	
	double get_volume(double r) {
		return  (2 * Math.PI * r * r * r) / 3;
	}
	
	double get_volume(double r, double h) {
		return Math.PI * (r * r) * h;
	}
	
	
	double get_volume(int l, int b, int h) {
		return  l * b * h;
	}
	
	protected void finalize( )
	{
		in.close();
	}
}

public class Solution {

	 public static void main(String[] args) {
		 
	   DoNotTerminate.forbidExit();
	   try {
	     Calculate cal = new Calculate();
	    int T = cal.get_int_val();
	    while (T--> 0) {
	     double volume = 0.0;
	     int ch = cal.get_int_val();
	     if (ch == 1) {
	      int a = cal.get_int_val();
	      volume = Calculate.do_calc().get_volume(a);
	     } else if (ch == 2) {
	      int l = cal.get_int_val();
	      int b = cal.get_int_val();
	      int h = cal.get_int_val();
	      volume = Calculate.do_calc().get_volume(l, b, h);

	     } else if (ch == 3) {
	      double r = cal.get_double_val();
	      volume = Calculate.do_calc().get_volume(r);

	     } else if (ch == 4) {
	      double r = cal.get_double_val();
	      double h = cal.get_double_val();
	      volume = Calculate.do_calc().get_volume(r, h);

	     }
	     cal.output.display(volume);
	    }

	   } catch (NumberFormatException e) {
	    System.out.print(e);
	   } catch (IOException e) {
	    e.printStackTrace();
	   } catch (DoNotTerminate.ExitTrappedException e) {
	    System.out.println("Unsuccessful Termination!!");
	   }


	  } //end of main
	} //end of Solution

	/**
	 *This class prevents the user form using System.exit(0)
	 * from terminating the program abnormally.
	 *
	 */
	class DoNotTerminate {

	 public static class ExitTrappedException extends SecurityException {}

	 public static void forbidExit() {
	  final SecurityManager securityManager = new SecurityManager() {
	   @Override
	   public void checkPermission(Permission permission) {
	    if (permission.getName().contains("exitVM")) {
	     throw new ExitTrappedException();
	    }
	   }
	  };
	  System.setSecurityManager(securityManager);
	 }
	} //end of Do_Not_Terminate
