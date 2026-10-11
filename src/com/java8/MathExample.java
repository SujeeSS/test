package com.java8;



import java.util.Optional;



public class MathExample {

	

	public static void main(String[] args) {

		System.out.println(Math.PI);

		

		int a=-10;

		System.out.println(Math.abs(a));

		System.out.println(Math.max(109, 22));

		System.out.println(Math.min(109, 22));

		System.out.println( Math.round(Math.sqrt(32))  );

		System.out.println(Math.pow(10, 3));

		System.out.println(Math.ceil(-4.5));//-3

		System.out.println(Math.floor(-4.5));//-5

		System.out.println(Math.random());

		

		 String name = "fjgjfbg";

		Optional<String> optName = Optional.ofNullable(name);



        // Safely handle null using orElse

        int length = optName.map(String::length)    // if value present → get length

                            .orElse(0);            // if null → return 0



        System.out.println("Length: " + length);

        

   

	}



}

