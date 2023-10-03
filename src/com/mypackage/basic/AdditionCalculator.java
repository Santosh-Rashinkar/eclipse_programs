package com.mypackage.basic;

import java. util.Scanner;

public class AdditionCalculator {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System. out.println("Enter The Number... ");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		
		System.out.println("Addition is: "+(num1+num2));	
	}
}


