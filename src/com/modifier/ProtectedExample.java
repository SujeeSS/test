package com.modifier;

 public class ProtectedExample {
	
	//protected
	
	//Access - variable,method;
	
	// Visibility - same class , another class , inheritance ,other package(when using extends); 
	
	// Not Visible - anotherr package; 
	
	
	protected int p=57;
	
	protected void PM() {
		System.out.println("naan thaan daa massu : " + this.p);
		
	}
	public static void main(String[] args) {
		
		ProtectedExample PE = new ProtectedExample();
		System.out.println(PE.p);
		PE.PM();
		
	}

}
