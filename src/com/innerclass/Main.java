package com.innerclass;

public class Main {
	public static void main(String[] args) {

		

//		inner class is a class defined within another class. 

		//types

//		1.Nested Inner Class

		OuterClass outer=new OuterClass();

		outer.OuterMethod();

		

		OuterClass.innerClass inner=new OuterClass().new innerClass();

		inner.innerMethod();

		



//		2.Method Local Inner Classes

		MethodLocalOuter local=new MethodLocalOuter();
		local.OuterMethod();

		



//		3.Static Nested Classes

		 StaticOuter.method1();

		 StaticOuter.StaticInner.method2();

		 //??
		 StaticOuter s1 = new StaticOuter();
			 

//		4.Anonymous Inner Classes
		 // creating obj for interface with inside functions:
		 
		 

		}
}
