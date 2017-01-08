package hackerrank.java.advanced.java_singleton_pattern;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton{
	public String str;
	private static Singleton self;
	private Singleton() {
		
	}
	static Singleton getSingleInstance(){
		if(self==null)
			self = new Singleton();
		return self;
	}
}

