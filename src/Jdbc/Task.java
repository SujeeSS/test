package Jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;

class obj {
	int sno, age, marks;
	String name;

	obj(int sn, String n, int a, int m) {
		this.sno = sn;
		this.name = n;
		this.age = a;
		this.marks = m;
	}

}

public class Task {


	static ArrayList<obj> detail = new ArrayList<obj>();
	public static void SQLG(Connection c, String q) throws SQLException {

		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery(q);
		while (rs.next()) {
			obj co = new obj(rs.getInt("sno"), rs.getString("name"), rs.getInt("age"), rs.getInt("mark"));
			detail.add(co);
//			System.out.println(rs.getInt("age"));

		}

	}
	
	

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/sample1", id = "root", pass = "Sujee2005S";
		Connection c = DriverManager.getConnection(url, id, pass);
		SQLG( c , "select * from person");

//		System.out.println(detail.get(2).age);
		
		
		for(obj a:detail) {
			
			System.out.println(a.name+" "+a.age);
			
		}
		

	}
}
