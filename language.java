package com.as.util;

public class language {
	String name;
	language(){
		System.out.println("Constructor method called");
	}
	
	language(String name){
		this.name=name;
	}
	public static void main(String[] args) {
		language Lg=new language();
		language java=new language("java");
		Lg.setName("C++");
		Lg.getName();
		java.getName();
	}
	void setName(String t){
		name = t;
	}
	void getName(){
		System.out.println("Language name:" + name);;
	}
}



