package com.thread;



public class Main2 {

	

	public static void main(String[] args) {

		

		TicketBooking t1=new TicketBooking("sujee", 5);

		TicketBooking t2=new TicketBooking("pragadeesh", 20);

		TicketBooking t3=new TicketBooking("sri", 5);

		

		t1.start();

		t2.start();

		t3.start();

		

	}



	

	

}