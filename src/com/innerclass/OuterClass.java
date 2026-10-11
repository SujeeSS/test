package com.innerclass;

public class OuterClass {
	 int s=100;
	public void OuterMethod() {

		System.out.println("outer class"+(new innerClass().a));

	}

	

	

public class innerClass{
int a=9;
		

		public void innerMethod() {

			System.out.println("inner class"+s);

		}

		

	}
}
