package com.filehandling;



import java.io.BufferedReader;

import java.io.BufferedWriter;

import java.io.FileNotFoundException;

import java.io.FileReader;

import java.io.FileWriter;

import java.io.IOException;
import java.io.InputStreamReader;



public class BufferRWExample{

	

	public static void main(String[] args) {

		String a="C:\\Users\\LENOVO\\eclipse-workspace\\Pragadees\\sujee.txt";

		FileWriter fw;

//		try {
//
//			fw = new FileWriter(a,true);
//
//			BufferedWriter bw=new BufferedWriter(fw);
//
////			bw.write("hello bufferWriter");
//
//			
//
//			bw.write("fsjlgkjlfgk;l");
//
//			bw.newLine();
//
//			bw.write("hbgjhfgjsehfwjfkxmckcjxhj");
//
//			bw.close();
//
//			fw.close();
//
//		} catch (IOException e) {
//
//			// TODO Auto-generated catch block
//
//			e.printStackTrace();
//
//		}

		

		

		try {
//			InputStreamReader ip = new InputStreamReader(System.in);
//			
//			BufferedReader sc = new BufferedReader(ip);
			
			BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
			
			String s = sc.readLine();
			System.out.println(Integer.parseInt(s));

//			FileReader fr=new FileReader(a);
//
//			BufferedReader br=new BufferedReader(fr);
//
//			System.out.println(br.read());
//
//			int ch;
//
//			while((ch=br.read())!=-1) {
//
//				System.out.print( (char)ch);
//
//			}
//			

		} catch (IOException e) {





			e.printStackTrace();

		}

		

		

	}



}