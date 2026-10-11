package com.string;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		

		//string

		//collection of characters

		//non - primitive - mutable

		//primitive - mutable 

		//immutable - string

		//double quotes

		//heap memory- string pool

		

		//achieve

		//1.literal 

		String name1="sujee";

		System.out.println(name1);

		String name2="sujee";

		System.out.println(name1==name2); //memory allocation

		//2.new keyword

		String str1=new String("sri"); 

		String str2=new String("Sri"); 

		

		System.out.println(str1==str2);

		

		System.out.println(str1.equals(str2));

		System.out.println(str1.equalsIgnoreCase(str2));

		

		System.out.println(str1.charAt(0));//index start from 0

		System.out.println(str1.length()); //length from 1

		

		System.out.println(str2.codePointAt(0));

		System.out.println(str1.codePointAt(0));

		System.out.println(str2.codePointBefore(2));

		

		System.out.println("Count:"+str1.codePointCount(0, 2));//0, 1,2

		System.out.println(str1.compareTo(str2)); //115-83=32

		System.out.println(str1.compareToIgnoreCase(str2)); //0

		

		System.out.println(str1.concat(str2+" "+name1));

		System.out.println(str1.contains("R"));

		System.out.println(str1);

			

//		System.out.println(str2.);
		
		
		
		System.out.println(name1.toUpperCase());
		System.out.println(name1.toLowerCase());

		System.out.println(name1.indexOf('e'));
		System.out.println(name1.indexOf("je"));
		String s1 = "  a bcd efkg k  kh i j kk  ";
		String s2 = " ";
		System.out.println(s1.length()+" p "+ ""+s1.trim()+" "+s1.trim().length()); // cut start and end space 
		System.out.println(s1.replace("k","...")); // replacing string once
		System.out.println(s1.replace('k','r')); // replacing char

		System.out.println(s1.isEmpty()+" "+s1.isBlank()); //
		System.out.println(s2.isEmpty()+" "+s2.isBlank());
		
		String words="jnehvejrenkje34465";
		System.out.println("Substring: "+words.substring(4,13));
		System.out.println(words.startsWith("J"));
		System.out.println(words.endsWith("e"));
		System.out.println(words.replace('j', '0'));
		System.out.println(words.replaceAll("[a-z,0-9]","0"));
		System.out.println(words.replaceFirst("[0-9,a-z]", "J"));
		
		System.out.println(words.indexOf("nk"));
		System.out.println(words.lastIndexOf("j"));

		//spilt ,to string
		
		String[] sp = words.split("e");
		String[] spl = words.split("e",3); //jnehvejrenkje34465
		String[] spd = words.splitWithDelimiters("e",4);
		System.out.println(Arrays.toString(sp));
		System.out.println(Arrays.toString(spl));
		System.out.println(Arrays.toString(spd));  //" ;;; "+String.valueOf(spd));//value of retrun reference value
		
		
		//, join
		System.out.println(String.join("-","full","stack","java"));
		
		
//		valueof  
		 int i=9009;
		 Integer I =1234567890;
//		 String num = String.valueOf(i);
//		 String num = String.valueOf(false);
//		 String num = String.valueOf(10.89);
		 String num = String.valueOf(I);
		 System.out.println(num);
		 

		


		

		

		

		

		

		

	}
}