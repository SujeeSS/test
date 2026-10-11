package com.constructor;

public class CopyConstructor {
	int roll;
	String name;
	
	public CopyConstructor(int r,String n) {
	this.roll=r;
	this.name=n;

		
		
	}
	
	public CopyConstructor(CopyConstructor c) {
		System.out.println(c.name+" "+(c.roll+90));
	}
	
	public static void main(String[] args) {
		CopyConstructor cc= new CopyConstructor(57,"Sujee");
		CopyConstructor cc1=new CopyConstructor(cc);
		CopyConstructor cc2=new CopyConstructor(cc1);
	}

}
