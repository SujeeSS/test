package com.java8;

import java.sql.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class TaskeDate {

	public static void main(String[] args) throws Exception {

		/// leave or not
		
		String value = "2025-12-25";
		
		
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample1", "root", "Sujee2005S");
		Statement s = c.createStatement();
		DateTimeFormatter form = DateTimeFormatter.ofPattern("dd-MM-yyy");
		LocalDate dtas =LocalDate.parse(value);
		String Dt = dtas.format(form);
		System.out.println(form +" "+Dt);
		ResultSet r = s.executeQuery("Select * from holidays");
		boolean f=true;
		while (r.next()) {

			if(r.getString("date").equals(Dt)) {
				System.out.println(Dt+" Day🤩🤩 is holiday🎇🎉... Due to ,  "+r.getString("type"));
				f=false;
			}

		}
		if(f) {
			System.out.println("Working day...🤦‍♀️🤦‍♀️🤦‍♀️");
		}

	}

}
