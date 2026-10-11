package com.thread;



public class Class1 extends Thread{

	

	String [] name = {"sri","sujee","Preagadeesh","hari"};

	

	public void run() {

		

		for(int i=0;i<name.length;i++) {

			System.out.println(name[i]+" 1");

			try {

				Thread.sleep(2000);

			} catch (InterruptedException e) {

				// TODO Auto-generated catch block

				e.printStackTrace();

			}

		}

		

	}

	

	



}