package com.java8;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionalExample {
	
	public static void main(String[] args) {
		Consumer<String> name = (n) -> System.out.println(n);
		name.accept("sujee");
		name.accept("80");
		Supplier<String> str = () ->"Welcome supplier";
		Function<String,Boolean> Fun = (n)-> n.contains("s");
		System.out.println(str.get());
		System.out.println(Fun.apply("sujee"));
	}

}
