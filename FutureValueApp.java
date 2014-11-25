package com.as.util;

import java.util.*;
import java.text.*;

public class FutureValueApp {
	
	public static void main(String[] args) {
		System.out.println("Welcome to the Future vale Calculator\n");	
		Scanner sc= new Scanner(System.in);
		String choice= "y";
		while(choice.equalsIgnoreCase("y"))
		{
			System.out.println("Data Entry");
			double monthlyInvestment=getDoubleWithinRange(sc,"Enter monthlyInvestment: ", 0,1000);
			double interestRate= getDoubleWithinRange(sc, "Enter yearly interestrate:",0,30);
			int years= getIntWithinRange(sc, "Enter number of Years: " , 0,100);
			
			double monthlyInterestRate = interestRate/12/100;
			int months=  years*12;
			double futureValue= calculateFutureValue(monthlyInvestment,monthlyInterestRate, months);
			
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			NumberFormat percent= NumberFormat.getCurrencyInstance();
			
			String results = "Monthly investment: \t" + currency.format(monthlyInvestment) + "\n"
							 + "yearly interest rate: \n" + percent.format(interestRate/100) + "\n"
							 + "Future Value:\t\t"+ currency.format(futureValue) +"\n";
			System.out.println();
			System.out.println("Formatted Reults");
			System.out.println(results);
			System.out.print("Continue? y/n:");
			choice=sc.next();
			sc.nextLine(); // discard any other data entered on the line
			System.out.println();
				
		}
		
	}
	
	public static double getDouble(Scanner sc, String prompt){
		double d=0.0;
		boolean isValid=false;
		while (isValid==false)
		{
		System.out.print(prompt);
		if(sc.hasNextDouble())
		{
			d=sc.nextDouble();
			isValid=true;
		}
		else
		{
			System.out.println("Error Invalid decimal value. Try again");
		}
		sc.nextLine();//discard any other data entered on the line   
		}
			return d;
			
		
		
	}
	
	public static double getDoubleWithinRange(Scanner sc, String prompt, double min, double max)
	{
		double d= 0.0;
		boolean isValid=false;
		while (isValid==false)
		{
			d=getDouble(sc,prompt);
			if(d<=min)
			{
				System.out.println("Error! Number must be greater that " + min+".");
			}
			else if (d>=max)
			{
				System.out.println("Error! Number must be less than" + max + ".");
			}
			else 
				isValid= true;
			
		}
		return d; 
	}
	

	public static int getInt(Scanner sc, String prompt){
		int i=0;
		boolean isValid=false;
		while (isValid==false)
		{
		System.out.print(prompt);
		if(sc.hasNextInt())
		{
			i=sc.nextInt();
			isValid=true;
		}
		else
		{
			System.out.println("Error Invalid inter value. Try again");
		}
		sc.nextLine();//discard any other data entered on the line   
		}
			return i; 
	}
	public static int getIntWithinRange(Scanner sc, String prompt, int min, int max)
	{
	int i=0;
	boolean isValid=false;
	while (isValid==false)
	{
		i= getInt(sc,prompt);
		if (i<=min)
			System.out.println("Error! Number must be greater than "+ min+ ".");
		else if (i>=max)
			System.out.println("Error! Number must be less than "+ max + ".");
		else
			isValid=true;
	}
		return i;
	}
	public static double calculateFutureValue(double monthlyInvestment, double monthlyInterestRate, int months)
	{
		double futureValue=0;
		for (int i=1; i<=months; i++)
		{
			futureValue= (futureValue+ monthlyInvestment)* (1+monthlyInterestRate);
		}
		return futureValue;
	}
	
}
