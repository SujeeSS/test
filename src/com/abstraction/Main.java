package com.abstraction;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {

	//abstraction

	//Abstraction is the process of hiding the implementation 

	//details and only showing the essential details to the user. 

	//achieve

	//1. abstract class

	// accessmodifier abstract class className{

	// }

	//2.interface

	// TvRemote tv=new TvRemote();

	// tv.display();

	// tv.ON();

	// tv.OFF();

	//interface

	//interface is a blueprint of a class

	//interface-class -object 

	//IS-A relationship - extends , implements 

	//has - a relationship - aggregate = *

	// accessmodifier interface interfaceName{

	// unimplement method

	// accessmodifier returnType methodName();

	// }

	System.out.println("enter payment method : ");

	Scanner sc=new Scanner(System.in);

	String paymentName=sc.next();

	switch(paymentName) {

	case "gpay":

	Gpay gpay=new Gpay();

	gpay.transaction();

	gpay.withdraw();

	break;

	case "paytm":

	Paytm paytm=new Paytm();

	paytm.transaction();

	paytm.deposit();

	break;

	default:

	System.out.println("choose gpay or paytm");

	}

	}

	//multiple inheritance

	//nested interface



	}



