package com.collection;



import java.util.*;

import java.util.*;



public class LinkedListExample {

	

	public static void main(String[] args) {

		

		List<String> fruits=new LinkedList<String>();

//		fruits.add("banana");

//		fruits.add("mango");

//		fruits.add("apple");

//		fruits.add("cherry");

//		fruits.add("kiwi");

		System.out.println(fruits);

		

//		fruits.add(null);

//		fruits.add(null);

//		fruits.add();

		System.out.println(fruits.isEmpty());

		Stack<String> course=new Stack<String>();

		course.push("html");

		course.push("CSS");

		course.push("Javascript");

		course.push("java");

		course.push("react js");

		

		System.out.println(course);

		course.pop();

		course.pop();

		System.out.println(course);

		System.out.println(course.peek()); //get

		System.out.println(course.search("css")); //position 1

		System.out.println(course.indexOf("CSS"));

	}



}

