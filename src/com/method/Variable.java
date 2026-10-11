package com.method;

import com.modifier.ProtectedExample;

public class Variable {
	
	int a;
	int b=10; //instance variable
	int z;

//	 Local variables are allocated in the stack memory, 
//	 while instance variables are allocated in the heap memory.
	
	public void mul(int x,int a) {
		this.a=a;
		int c;
		c=20;
		System.out.println(c);
		int y=20;// local variable
		System.out.println(x);
		System.out.println(b);
		System.out.println(y);
		System.out.println(a);
		System.out.println(z);
		
		
	}
   public void div() {
	System.out.println(b);
//	System.out.println(y);
}
	//Types of Variables
	//local variable
//	instance variable
	//static variable
	
	public static void main(String[] args) {
		int z=39;
		Variable obj=new Variable();
		obj.mul(5,4);
		obj.div();
		System.out.println(obj.b);
		
	///
	System.out.println("Protect test:");
	ProtectedExample pro = new ProtectedExample();
//	System.out.println(pro.p);
//	pro.PM();                  not able to access
		
	}
}
