package com.example;

import java.util.Scanner;

public class ConditionStatement {
	
	//condition statement
	//if
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		System.out.println(a);
		
		if(a>0) {
			System.out.println("positive number");
		}
		else if(a<0){
			System.out.println("negative number");
		}
		else {
			System.out.println("zero");
		}
	}
	
	//else
	//else if
	//switch
	//nested
	
	//0-2 -baby
	//3 - 49 - adults
//	    3 - 5 - play school
//	    6 to 17 - school
	//  18 to 35 - clg
	//  36 - work
	//50- 70 - middle
	//71 above old 

}
