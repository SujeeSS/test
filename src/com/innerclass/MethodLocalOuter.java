package com.innerclass;

public class MethodLocalOuter {
	public void OuterMethod() {

//		int a;

		System.out.println("method local outer classs");

		

		 

		 class MethodLocalInner{

			public void innerMethod() {

				System.out.println("method local inner class");

				

			}

			

		}

		 

		 MethodLocalInner m=new MethodLocalInner();

		 m.innerMethod();

	}
}
