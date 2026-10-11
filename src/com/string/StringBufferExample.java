package com.string;

import java.util.Scanner;


public class StringBufferExample {
	
	public static void main(String[] args) {
		
		//string buffer 
		//string builder
//		Scanner sc=new Scanner(System.in);
        String a="String Buffeer";
		
		StringBuffer buffer=new StringBuffer(a.replace("er", "s"));
		System.out.println(buffer);
		buffer.append("21234567890123456"); 
		System.out.println(buffer);
		buffer.insert(6, "hello");
		System.out.println(buffer);
		buffer.replace(6, 11, " welcome");
		System.out.println(buffer);
		buffer.delete(6,11);
		System.out.println(buffer);
		buffer.reverse();
		System.out.println(buffer);
		System.out.println(buffer.length());
		System.out.println(buffer.capacity()); //13+17=30*2
		
		
		
		
		
	}

}