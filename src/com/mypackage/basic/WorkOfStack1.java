package com.mypackage.basic;

public class WorkOfStack1{
	
		int roll;
		String name;
		public static void print()
		{
			int i=20;
			System.out.println(i);
			print2();
		}
		public static void print2()
		{
			Integer j=20;
			System.out.println(j);
			print3();
		}
		
		public static void print3()
		{
			float f=30;
			System.out.println(f);
		}
	   
		static 
		{
	     System.out.println("inside static block statement no1 ...!!!");	 
		}
		public WorkOfStack() {
			
		}
		
		public WorkOfStack(int roll, String name) {
			super();
			this.roll = 20;
			this.name = "santosh";
		}

		{
		 System.out.println("inside instance block statement no1 ...!!!");	 	
		}
		
		public static void main(String[] args)
		{
			
		System.out.println("start of program");
		
		print();
		
		WorkOfStack w = new WorkOfStack(20,"santosh");
		
		System.out.println("end of program");
		
		}

	}	


