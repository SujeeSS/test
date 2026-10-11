package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//array

//array is collection of data store in a single variable - same type 

//non- primitive

//mutable 

//array is a object 

//[] {}

//datatype [] arrayName = { };

		int[] number = { 1, 2, 5, 7, 5 };

		System.out.println(number);// object reference id

		System.out.println(number[0]);// index

		System.out.println(number.length);

//for loop

		for (int i = 0; i < number.length; i++) {

			System.out.println(number[i] +" .");

		}
		System.out.println(Arrays.toString(number));

//for each

// for(datatype newarray : oldArray) {

// System.out.println();

// }

		System.out.println("for each");

		for (int i : number) {

			System.out.println(i);

		}

		String[] names = new String[5]; // length

		names[0] = "sri";

		names[1] = "sujee";

		names[2] = "null";

		for (String i : names) {

			if (i != null) {

				System.out.println(i);

			}

		}
		System.out.println(Arrays.toString(names));

//types

//1.single array

//2.multi- dimentional array

		int matrix[][] = new int[3][3]; // 2 //2

		matrix[0][0] = 1;

		matrix[0][1] = 2;

		matrix[0][2] = 3;

		matrix[1][0] = 4;

		matrix[1][1] = 5;

		matrix[1][2] = 6;

		matrix[2][0] = 7;

		matrix[2][1] = 8;

		matrix[2][2] = 9;

		for (int i = 0; i < matrix.length; i++) {

			System.out.print("[");

			for (int j = 0; j < matrix.length; j++) {

				System.out.print("[" + matrix[i][j] + "]");

			}

			System.out.println("]");

		}

		for (int m[] : matrix) {

			for (int n : m) {

				System.out.println(n);

			}

		}
		Scanner sc= new Scanner(System.in);

		int[][] t = new int[4][3];
		int c = 0;
		for (int[] s : t) {
			for (int ss : s) {
				ss = sc.nextInt();
				c++;
			}
		}
		
		for(int q=0;q<t.length;q++) {
			for(int w=0;w<t[q].length;w++) {
				System.out.print(" "+t[q][w]);
			}
			System.out.println("");
		}
		
		
	}

}