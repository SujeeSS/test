package com.array;



public class BubbleSort {

public static void main(String[] args) {

int[] arr = {5, 3, 8, 4, 2};



// Bubble Sort

for (int i = 0; i < arr.length - 1; i++) { //0<4



for (int j = 0; j < arr.length - 1 - i; j++) { //0<5-1-0//0<4

if (arr[j] > arr[j + 1]) { //8>2

// Swap

int temp = arr[j]; //8

arr[j] = arr[j + 1];//2

arr[j + 1] = temp; //

// 3 5 4 2 8

// 3 4 2 5 8

// 3 2 4 5 8

// 2 3 4 5 8

}

}



}





System.out.print("Sorted array: ");

for (int n : arr) {

System.out.print(n + " ");

}

}

}