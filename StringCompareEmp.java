package com.as.util;

public class StringCompareEmp {
 public static void main(String[] ars)
 {
	 String str="Hello world";
	 String anotherString="hello world";
	 Object objStr=str;
	 
	 System.out.println(str.compareTo(anotherString));
	 System.out.println(str.compareToIgnoreCase(anotherString));
	 System.out.println(str.compareTo(objStr.toString()));
	 
	 
	 
 }
 
}
