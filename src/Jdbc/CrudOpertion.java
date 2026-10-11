package Jdbc;

import java.sql.*;
import java.util.Scanner;

public class CrudOpertion {
	static Connection con;
	static Statement st ;
  static Scanner sc = new Scanner(System.in);
	static {
		try {
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdetails","root","Sujee2005S");
		 st = con.createStatement();
	}catch(Exception e) {
		System.out.println(e);
	}
	}
	
	
	
	
	
	public static void main(String[] args) throws Exception {
//		CrudOpertion cp = new CrudOpertion();
		display();
		delete();
		display();
		add();
		
	}
	
	
	
	static void add() throws Exception {
		System.out.println("Enter the rollno: ");
		int rol = sc.nextInt();
		System.out.println("Enter the name: ");
		String name = sc.next();
		System.out.println("Enter the Mark: ");
		int mrk = sc.nextInt();
		System.out.println("Enter the Grade: ");
		String grd = sc.next();
		if(st.executeUpdate(  "insert into st values("+rol+",'"+name+"',"+mrk+",'"+grd+"');"  ) > 0) { //... valuse(12,'sujee',90,'O');
			System.out.println("added");
		}else {
			System.out.println("not added");
		}
	}
	
	static void delete() throws Exception { 
		System.out.print("Enter the name to delete: ");
		String name =sc.next();
		String q = " delete from st  where name= '"+ name +"';"; // deletee form st where name='sujee';
		if(st.executeUpdate(q) >0) {
			System.out.println("deleted");
		}else {
			System.out.println("not found");
		}
		
	}
	 static void display() throws Exception {
		
		ResultSet ans = st.executeQuery("select * from st;");
		while(ans.next()) {
			System.out.print( ans.getInt("rollno")+" ");
			System.out.print( ans.getString(2)+" ");
			System.out.print( ans.getInt(3)+" ");
			System.out.println("");
			
		}
	}

}
