package com.java8;



import java.util.function.Predicate;



public class PredicateExample {

public static void main(String[] args) {

	

	Predicate<Integer> isEven=(n)->n%2!=0;

	System.out.println(isEven.test(3));

	Boolean a=isEven.test(3);

//	Predicate = condition stored in a variable.

	

	if(a==false) {

		System.out.println("even number");

	}

	else {

		System.out.println("odd number");

	}

	

}

	



}


