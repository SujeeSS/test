package com.thread;



public class Class3 implements Runnable{

	

	public void addCount()  {

		for(int i=1;i<=5;i++) {

			System.out.println("count:"+i +Thread.currentThread().getName());

			

//			try {

//				Thread.sleep(1000);

//			} catch (InterruptedException e) {

//				// TODO Auto-generated catch block

//				e.printStackTrace();

//			}

		}

		

	}



	@Override

	public void run() {

	      addCount();

		

	}



}