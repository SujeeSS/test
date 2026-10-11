package Jdbc;

import java.sql.*;
import java.util.*;
public class PostExample {

	
	public static void main(String[] args)throws Exception {
		
		Scanner sc = new Scanner(System.in);
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdetails","root","Sujee2005S");
		Statement sta = c.createStatement();
//		if(st !=null) {
//			System.out.println("connected");
//			
//		}else {
//			System.out.println("not connected");
//		}
//		 TO viwe 
		
		ResultSet ans = sta.executeQuery("Select * from st");
		
		
		while(ans.next()) {
			System.out.println("rollnumber: "+ans.getInt("rollno")+" Name: "+ans.getString("name")+" --- MaRk: "+ans.getInt("mark"));
		}
		
		
		String createQ= "create table st (rollno int ,name varchar(50),mark int,grade varchar(10));" ;
//		st.executeUpdate(createQ); //  run only first time(1time)
		
		
//		String insertQ="insert into st (rollno,name,mark,grade) values(?,?,?,?)";
//		PreparedStatement p = c.prepareStatement(insertQ);
//		System.out.print("enter the rollno: ");
//		int r1 = sc.nextInt();
//		p.setInt(1, r1);
//		System.out.print("enter the name: ");
//		String n1 = sc.next();
//		p.setString(2, n1);
//		System.out.print("enter the mark: ");
//		int m1 = sc.nextInt();
//		p.setInt(3, m1);
//		System.out.print("enter the grade: ");
//		String g1 = sc.next();
//		p.setString(4, g1);
////		p.executeUpdate();
//		System.out.println("run run ");
		
		String delQ= " delete from st where rollno = ?;";
		PreparedStatement delp = c.prepareStatement(delQ);
		delp.executeUpdate();
		System.out.println("enter the roll to delete ");
		int roln = sc.nextInt();
		 if(roln != -1){
		delp.setInt(1, roln);
		
		delp.executeUpdate();
		System.out.println("deleted");
		
		}else{
		System.out.println("not found "); 
		
		}
		
		
		
		
//		p.close();
		delp.close();
		sta.close();
		c.close();
		
	}
}
