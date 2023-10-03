package com.mypackage.basic;

import java. util.Scanner;

public class MultiplicationCalculator {
	
	public static int multiplicationCalculate(int num1, int num2, int num3){
		
   return (num1*num2*num3);
		
 }

	public static void main(String[] args) {

	    Scanner scan = new Scanner(System.in);

		System.out.println("Enter The Number...");

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		System.out.println("The Multiplication is:" +(num1*num2*num3));
	}
}
