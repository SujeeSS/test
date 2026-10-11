package com.java8;



import java.text.*;
import java.time.LocalDate;

import java.time.LocalDateTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;



public class DateExample {

	

	public static void main(String[] args) {

		

	LocalDate date=	LocalDate.now();

//	System.out.println(date);

	LocalTime time= LocalTime.now();

	System.out.println(time);

	LocalDateTime data_time= LocalDateTime.now();

	System.out.println(data_time);

	 LocalDate d =LocalDate.of(2024,04,21);

//	 LocalDate date =LocalDate.parse("2023-05-10");
	 
	 
	 
	 

	 

	System.out.println(date.getYear());

	System.out.println(date.getMonth());

	System.out.println(date.getDayOfMonth());

	System.out.println(date.getMonthValue());

	System.out.println(date.getDayOfWeek());

	

	System.out.println(time.getHour());

	System.out.println(time.getMinute());

	System.out.println(time.getSecond());

	System.out.println(time.getNano());

	System.out.println(d.isAfter(date));

	System.out.println(d.isBefore(date));

	System.out.println(date.getDayOfYear());
	
	
	
	
//	formating
	String DStr ="14-02-2005";
	
	DateTimeFormatter fr = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	
	LocalDate dta = LocalDate.now();//parse(DStr,fr);
	String frm = dta.format(fr);
	System.out.println(dta+" Formating: "+frm);
	
		

		

	}



}