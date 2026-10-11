package com.collection;



import java.util.ArrayList;

import java.util.List;



public class MainArrayList{

	

	public static void main(String[] args) {

		

		// Collection in Java is a framework

		//classes and interface

//		searching, sorting, insertion, manipulation, and deletion

		

//		interface or class <Data type> arrayname=new className<Data type>();

		//data type - object

		//wrapper class

		List<Integer> numbers=new ArrayList<Integer>();
		

		numbers.add(2);

		numbers.add(6);

		numbers.add(9);

		numbers.add(1);

		numbers.add(8);

		numbers.add(4);

		//ordered

		//duplicate values add

		

		

		

		System.out.println(numbers);

		numbers.add(2, 7);

		System.out.println(numbers);

		System.out.println(numbers.get(1)); //index

		numbers.set(2, 8);

		System.out.println(numbers);

		int re = numbers.remove(0);

		System.out.println(re+" "+numbers);

//		numbers.clear();

		System.out.println(numbers.isEmpty());

		System.out.println("size: "+numbers.size());//length

		System.out.println(numbers.contains(9));

		System.out.println(numbers.indexOf(9));//first position of 8

		System.out.println(numbers.lastIndexOf(8));
		//last position of 8
		System.out.println(numbers.lastIndexOf(8));//last position of 8

		

		for(int i=0;i<numbers.size();i++) {

			System.out.print(numbers.get(i)+" ");

		}

		
		System.out.println("\n for each ");

		for(Integer i:numbers) {

			System.out.print(i+" ");

		}

		

		

		

	}



}