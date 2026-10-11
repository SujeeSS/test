package com.collection;



import java.util.*;



public class SetExample {

	

	public static void main(String[] args) {

		

//		Set<String> product=new HashSet<String>();

//		product.add("pen");

//		product.add("scale");

//		product.add("penil");

//		product.add("eraser");

//		product.add("paper");

//		

//		System.out.println(product);

//		product.add("water bottle");

//		product.add("bag");

//		product.add("bag");

//		System.out.println(product);

		

		Set<String> product=new LinkedHashSet<String>();

		product.add("pen");

		product.add("scale");

		product.add("penil");

		product.add("eraser");

		product.add("paper");

		product.add("paper");

//		product.add(null);

		System.out.println(product);

		

		TreeSet<Integer> ascending=new TreeSet<Integer>();

		ascending.add(6);

		ascending.add(9);
		ascending.add(9);

		ascending.add(2);
		ascending.add(2);

		ascending.add(4);

		ascending.add(1);

		System.out.println(ascending);

		System.out.println(ascending.first());

		System.out.println(ascending.last());

		System.out.println("ceil: "+ascending.ceiling(5));// ≥ 

		System.out.println(ascending.floor(4));//≤

		System.out.println(ascending.higher(6));

		System.out.println(ascending.lower(6));

//		ascending.pollFirst();

//		ascending.pollLast();

		System.out.println(ascending);

		System.out.println("tail: "+ascending.headSet(4));

		System.out.println(ascending.tailSet(4));

		System.out.println(ascending.subSet(2, 9));

		Object[]  a = ascending.toArray();
		
		System.out.println(a[2]+" or: "+ascending.toArray()[2]);
		
 
		

	}
}



