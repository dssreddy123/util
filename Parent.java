package com.as.util;

public class Parent extends GrandParent {
	int b;
	Parent(int a, int b){
		super(a);
		this.b=b;
	}
void show(){

	System.out.println("Grandparent's a =" +a);
	System.out.println("Parent's b =" +b);
}

}
