package com.collection;
import java.util.*;
import java.lang.*;

public class FIFO {
	static List <Integer> n = new LinkedList<Integer>();
	static void ADD(int i) {
		n.addFirst(i);
	}

	public static void main(String[] args) {
		int c=0,num;
		while(c<3) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Add\n2.Print current \nOthers..exit\nEnter the choice: ");
		c=sc.nextInt();
		if(c == 1) {
			System.out.println("enter the number to add: ");
			num = sc.nextInt();
			ADD(num);
		}
		else if(c == 2) System.out.println(n);
		else {
			System.out.println("Code Exited ");
			break;
		}
		}
	}
}
