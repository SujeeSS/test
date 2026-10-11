package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;



public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String url = "jdbc:mysql://localhost:3306/sample1", id = "root", pass = "Sujee2005S"; //url = <jdbc connection link--3306/>/db name
		Connection con = DriverManager.getConnection(url, id, pass);
		ArrayList<Integer> sss = new ArrayList<Integer>(); 
		if(con!=null) {
			
			System.out.println("Conected:  "+con);
			
			String q = "select * from person";
			Statement stm= con.createStatement();
			ResultSet ans = stm.executeQuery(q);
			while(ans.next()) {
			int sno = ans.getInt("sno");
			String name = ans.getString("name");
			int mark= ans.getInt("mark");
			int age = ans.getInt("age");
			sss.add(age);
			
			System.out.println(sno+" "+name+"   "+mark+"  "+age); 
			
			}
			System.out.println("mark: "+sss);
			
			
			
		}else {
			System.out.println("not Connected");
			
		}
		
	}
}
