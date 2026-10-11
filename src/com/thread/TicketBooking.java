package com.thread;



public class TicketBooking extends Thread{

	

	static int availableTickets=20;

	int ticketCount;

	

	public TicketBooking(String name,int ticketCount) {

		super(name);

		this.ticketCount=ticketCount;



	}

	

	//Types of synchronization:

//	1.Synchronized method

//	  public synchronized void increment() { }

//	2.Synchronized block	

//	 synchronized (this) {

      

//     }

	

	public void run() {

		

		synchronized (TicketBooking.class) {

			if(availableTickets>=ticketCount) {

				System.out.println("_________________________");

				System.out.println(getName());

				System.out.println("ticked booked:"+ticketCount );

				availableTickets-=ticketCount;

				System.out.println("availableTickets:"+availableTickets);

				System.out.println("_________________________");

			}

			else {

				System.out.println("better luck next time only available ticket:"+availableTickets);

			}

		}

		

	}

	



}

