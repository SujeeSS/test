package com.java8;



import java.util.Arrays;

import java.util.List;



public class StreamExample {

	

	public static void main(String[] args) {

		

		//STream api

		//map 

		List<String> food=Arrays.asList("idly","briyani","dosa","chappathi","sambar satham","bhfd");

		System.out.println(food);

//		list.stream()

		System.out.println(	food.stream().map(String::toUpperCase).toList());

		//filter 

		System.out.println(food.stream().filter(item->item.startsWith("b")).toList());

		food.forEach(System.out::println);

		

		//sort

		List<String> food1=food.stream().sorted().toList();

				food1.forEach(System.out::println);

				

				

//				filter() → Select elements based on condition

//

//				map() → Transform each element

//

//				sorted() → Sort elements

//

//				distinct() → Remove duplicates

//

//				limit(n) → Take first n elements

//

//				skip(n) → Skip first n elements

//

//				collect() → Convert back to list, set, or map

//

//				reduce() → Reduce elements to a single value

	

		

		

		



	



		//fileter

		//sort

		

		

		

	}



}

