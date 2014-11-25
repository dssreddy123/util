package com.as.util;
import java.util.Scanner;

public class ProductApp {
public static void main(String[] args) {
	System.out.println("Welcome to the Product Selector");
	System.out.println();
	Scanner sc= new Scanner(System.in);
	String choice ="y";
	 while (choice.equalsIgnoreCase("y"))
			 {
		 System.out.print("Enter Product Code:   ");
		 String productCode =sc.next();
		 sc.nextLine();
		 Product product = ProductDb.getProduct(productCode);
		 System.out.println();
		 System.out.println("Selected Product");
		 System.out.println("Description" + product.getProduction());
		 System.out.println("Price" + product.getFormattedPrice());
		 System.out.println();
			 }
}
}