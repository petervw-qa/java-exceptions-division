package com.qa.main;

import java.util.Scanner;

public class Controller {
	
	private double num1;
	private double num2;
	
	Divison div = new Divison();
	
	public void userMenu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Would you like to access the division calculator?\n");
		System.out.println("1. Yes");
		System.out.println("2. No");
		
		String input = scan.nextLine();
		
		int numinput = Integer.parseInt(input);
		
		switch (numinput) {
		
		case 1:
			System.out.println("Welcome to the Divison calculator.\n");
			System.out.println("Please enter the first number: ");
			input = scan.nextLine();
			num1 =  Integer.parseInt(input);
			setNum1(num1);
			
			System.out.println("Please enter the second number: ");
			input = scan.nextLine();
			num2 =  Integer.parseInt(input);
			setNum2(num2);
			
			System.out.println("The result is: " + div.divide(getNum1(), getNum2()));
			scan.close();
			break;
			
		case 2:
			System.out.println("Thank you for using the divison calculator!");
			System.out.println("Goodbye!");
			break;
			
		default:
			System.out.println(" ");
			System.out.println("Something went wrong!");
			userMenu();
			
		}
		
		
		
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	

	
}
