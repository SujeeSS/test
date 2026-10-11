package com.thread;

public class MainT {

	public static void main(String[] args) throws Exception {

//		thread 

//		Extending Thread Class

		// start

//		Class1 c1 = new Class1();
//
//		Class2 c2 = new Class2();
//
//		c1.start();
//
//		c1.join();
//
//		c2.start();
//
//		c2.join();

//		Implementing a Runnable interface

		Class3 cl3 = new Class3();
		Thread t1 = new Thread(cl3, "th-1");// (<runable class>,"<Thread name>")
		Thread t2 = new Thread(cl3, "th-2");// (<runable class>,"<Thread name>")

		t1.start();
		t2.start();
		t1.join();
		t2.setPriority(Thread.MAX_PRIORITY); 
		
//		t1.setPriority(Thread.NORM_PRIORITY);
		
		t1.setPriority(Thread.MIN_PRIORITY);

		
		System.out.println(t1.isAlive()+" :: "+t1.isDaemon()); 
		
		System.out.println("hello");

	}

}