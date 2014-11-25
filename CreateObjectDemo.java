package com.as.util;
import java.util.*;
import java.awt.*;
import java.text.*;

public class CreateObjectDemo {
public static void main(String[] args) {
	Point originOne= new Point(23,94);
	Rectangle rectOne= new Rectangle (23,94);
	Rectangle rectTwo= new Rectangle (50,200);
	
	System.out.println("Width of rectOne: " + rectOne.width);
	System.out.println("Height of rectOne:"  + rectOne.height);
	System.out.println("Area of rectOne: "+ getArea());
	
	System.out.println("X postion of rectTwo:" + rectTwo.origin.x);
	System.out.println("Y postion of rectTwo:" + rectTwo.origin.y);
	
}
public static int getArea()
{
	int area = 23 * 94;
	return area ; 
}
}
http://docs.oracle.com/javase/tutorial/java/javaOO/arguments.html