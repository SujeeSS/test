package com.enum1;



public class EnumExample {

	

	public static void main(String[] args) {

		

	

	Days d=	Days.TUESDAY;

	

	

	System.out.println(d.ordinal());

	System.out.println(d.values());

	for(Days day:d.values()) {

		System.out.println(day+" "+ (day.ordinal()+1));

	}

//	for(Days n:d) {

//		System.out.println(n.values());

//	}

	

	

	Traffic t= Traffic.GREEN;

	System.out.println(t.getColor());



		

		

		

	}



}