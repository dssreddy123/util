package com.as.util;

public class StringComparePerformance {
public static void main(String[] args) {
	long stratTime = System.currentTimeMillis();
	for (int i=0;i<5000;i++){
		String s1= "hello";
		String s2="hello";
		}
	long endTime= System.currentTimeMillis();
	System.out.println("Time taken for creation" + "of String literals:" + (endTime- stratTime)+"milli seconds");
	long startTime1 = System.currentTimeMillis();
	
	for (int i=0;i<5000;i++){
		String s3= new String("hello");
		String s4= new String("hello");
	}
	long endTime1= System.currentTimeMillis();
	System.out.println("Time taken for creation" + "of String objects:" + (endTime1- startTime1)+"milli seconds");
}
}
