package com.innerclass;

interface AYExp {

//	public void action();
//	public String attack(String a, String b);
	int fun(int a, int b);
}

public class AnonymousClass {
	public static void main(String[] args) {

//		AYExp a = new AYExp() {
//			public void action() {
//				System.out.println("Action Completed");
//			}
//	};

//		AYExp  si = (a,b) -> a+" :SUJEE: "+b;
		AYExp  si = (a,b) -> a+b;
		
//		System.out.println(si.attack("null","fight"));
	System.out.println(si.fun(1,2));
}
}
