package com.error;



import java.util.InputMismatchException;

import java.util.Scanner;



public class Main2 {

	

	

	public static void vote(int age,String name) throws Exception {

		if(age<=18)  throw new Exception("below 18 ");

		if(age>=35)  throw new Exception("above 35");

		if(name==null) throw new Exception("check name");

		if(name.length()>=16) throw new Exception("minimum 16 char");

	

		

	System.out.println("eligible for attend the interview");

		

	}

	

	

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.println("enter the age");

		

		try {

			int a=sc.nextInt();

			vote(a,"sri");

			

		}

		catch (InputMismatchException e) {

       

            throw new RuntimeException("Invalid input. Age must be a number.");

		}

		catch (Exception e) {

			System.err.println(e.getMessage());

		}

		System.out.println("gvhdhj");

		//throw

		//method inside 

		//checked / unchecked

		//throws 

		//-before block /checked

		

	}

}