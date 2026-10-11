package com.Algorithm;

import java.util.Arrays;

public class SelectionSort {

	static void SS(int[] a) {/// O(n**2)
		for(int i=0;i<a.length;i++) {//1<11,..
			for(int j=0;j<a.length;j++) {//
				if(a[i]<a[j]) { //1<1,1<3(3,1)
					int t = a[i];///1
					a[i] = a[j];//3
					a[j] = t;//1
				}
			}
		}
		System.out.println(Arrays.toString(a));
		
	}
	public static void main(String[] args) {
		int Array[] = {1,3,6,4,2,9,7,5,4,6,8};
		System.out.println(Arrays.toString(Array));
		SS(Array);
	}
}
