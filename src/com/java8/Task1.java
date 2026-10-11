package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Task1 {
	public static void main(String[] args) {
		Consumer<Integer> sqr = (n) -> System.out.println(n * n);
		Consumer<String> hel = (n) -> System.out.println("hello " + n);
		sqr.accept(5);
		hel.accept("Bro");
		
		Function<String, Integer> len = (n) -> n.length();
		Function<String, String> up = (n) -> n.toUpperCase();
		System.out.println(up.apply("sujee"));
		System.out.println(len.apply("sujee"));

		
//		String[] ar =;
		List<String> SL =new ArrayList<String>(Arrays.asList(new String[]{"sujee","asim","sri","vicky"}));
		
		
	}

}
