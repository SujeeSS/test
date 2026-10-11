package com.Algorithm;

public class BinarySearcH {
	//Only for Sorted  array;
	static int BS(int [] Array, int Target) {
		int Left=0;
		int Right = Array.length;
		while(Left <= Right ) {
			int Mid = Left+(Right - Left)/2;
			
			if(Array[Mid] == Target)
				return Mid;
			if(Array[Mid]>Target) {
			    Right = Mid-1;
			}
			else {
				Left = Mid;
			}
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		
		int a[]= {1,3,6,8,9},t=7;
		int Result = BS(a,t);
		if(Result == -1) {
			System.out.println("element not founded:");
		}
		else {
			System.out.println("Element is founded at the index of:"+Result);
		}
	}
}
