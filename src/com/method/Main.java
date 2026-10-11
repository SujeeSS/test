package com.method;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Main {
	//method
	//A method in Java is a block of code that performs a specific task
	//code reusability
	
	//syntax
	//predefined method
	//user defined method
	
	//1.static method - main method
	//2.intance method
	
	
	//accessmodifer static returnType  method Name(string [] arg){
	//body
//}
	
	
//	instance method - declare and initial
//	accessmodifier returntype methodName(){
	//body
//}
	
//	accessmodifier - default, public , private , protected
//  return type- void, all data type
// method Name- camelcase
	
	public void add() {
		System.out.println(10+20);
	}
	
	public int subraction(int a,int b) { //parameter
		System.out.println(a);
		return a-b;
		
	}
	public static void main(String[] args) {
		
		//object create
		//classname objectname=new constructorName();
		//constructor ans classname also same
		Main main=new Main();
		//calling  instance method
//		objectname.method();
		int a1=10;
		main.add();
		main.add();
		int a2=main.subraction(50,a1); //arguments
		System.out.println(a2);
		
		StaticMethod.add();
		
		
		LinkedList<Integer> lt = new LinkedList<Integer>(Arrays.asList(10,20,45,67,89,3,2,2,5,776,32,44,64));
		int[] a = {1,2,3,4,4,5,6};
//		System.out.println("SSS: "+Arrays.stream(a));
		
		Arrays.stream(a).forEach(x -> System.out.println(x+" n"));
		
		
		
		
	}
}
