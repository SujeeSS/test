package com.thread;



public class Class2 extends Thread{

	

	String [] name = {"sri","sujee","Preagadeesh","hari"};

	

	public void run(){

		

		for(int i=0;i<name.length;i++) {

			System.out.println(name[i]+" 2");
try {
			Thread.sleep(1000);
}
catch(Exception e){
	System.err.println(e);
}

		}

		

	}

	

	



}