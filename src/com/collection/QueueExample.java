package com.collection;



import java.util.PriorityQueue;

import java.util.Queue;



public class QueueExample {

	

	public static void main(String[] args) {

		

		Queue<String> food=new PriorityQueue<String>();

		food.add("idly");

		food.add("dosa");

		food.add("chappathi");

		food.add("pongal");

		food.add("briyani");

		food.add("briyani");

//		food.add(null);

		

		System.out.println(food);

		

		food.offer(" puri");
//		System.out.println("++"+food);

		food.offer("veg briyani");

		System.out.println(food);

		

		food.remove();

		System.out.println(food);

		

		food.remove();

		System.out.println(food);

		food.remove();

		System.out.println(food);

		//fifo

		food.poll();

		System.out.println(food);

		food.clear();

		System.out.println(food.isEmpty());

//		food.remove();

//		System.out.println(food);



		food.poll();

		System.out.println(food);		

		System.out.println("herlll");

//		System.out.println(food.element());

		System.out.println(food.peek());

	}



}