package com.Algorithm;

import java.util.Arrays;

public class LinearSearch {
static int LS(int[] a,int t) {
	int in=0;
	for(int i: a) {
		if(i == t) {
			return in;
		}
		in++;
	}
	
	
	return -1;
}

public static void main(String[] args) {
	int t=8,array[]= {1,3,5,8,2,4,68,2};
	int R=LS(array,t);
	System.out.println("Element Are: "+Arrays.toString(array)+" And Target: "+t);
	if(R == -1 ) {
		System.out.println("Element is not founded");
	}
	else {
		System.out.println("Element is found at index :"+R);
	}
}
}
