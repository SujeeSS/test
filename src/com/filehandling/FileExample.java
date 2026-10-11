package com.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class FileExample {
	public static void main(String[] args) {

		File nf = new File("sujeeJ.txt");
		
		
		try {
//			FileWriter fw = new FileWriter(nf);  //replace the old data
			FileWriter fw = new FileWriter(nf,true); // not replace the data
			fw.write("Sujeendhar M is my name:");
			
			
			FileReader fr  = new FileReader(nf);
			
//			System.out.println(fr.read()); // first letter ACII value 
			int ch;
			
//			while((ch = fr.read()) != -1){
//				System.out.print((char)ch);
//			}
			 System.out.println();
			 
			 
			 
			 System.out.println("After Encoding: "+fr.getEncoding());
			 System.out.println("After hashcoding: "+fr.hashCode());
			 System.out.println(nf.getAbsolutePath());
			 System.out.println(nf.getPath());
			 System.out.println(nf.getName());
			 
			 System.out.println(nf.exists());
			 System.out.println(nf.canRead());
			 
			 
			 
			 
			 
			 
			fw.close();
			fr.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
