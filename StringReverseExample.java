package com.as.util;

public class StringReverseExample {
public static void main(String[] args) {
	String string="ABCDEF";
	String reverse=new StringBuffer(string).reverse().toString();
	System.out.println("\n String before revesre: "+string);
	System.out.println("\n String after reverse:   "+ reverse);
}
}
