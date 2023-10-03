package com.mypackage.basic;

public class Addition {
	
	public static int additionOfTwo(int a,int b) {
		
		System.out.println ("addition method started..!!");
		
		int c = a+b;
		
		System.out.println ("the result: " +c);
		
		System.out.println ("addition method ended..!!");
		
		return c;
	}

	public static void main(String[] args) {
		
		System.out.println("main method started..!!");
		
		Addition.additionOfTwo(10,30);
		
		System.out.println ("main method ended..!!");
	}

}