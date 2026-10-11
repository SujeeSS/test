package com.array;



import java.io.CharArrayReader;
import java.util.Arrays;



public class ArrayMethods {

public static void fruits(String [] fname) {

for(int i=0;i<fname.length;i++) {

System.out.println("fruits name:"+fname[i]);

}

}

public static void main(String[] args) {

String [] f= {"apple","orange","mango"};

fruits(f);

String s=Arrays.toString(f);

System.out.println(s);

System.out.println(s.toUpperCase());

int num1[]= {9,5,32,1,6,8};

Arrays.sort(num1);

Arrays.sort(f);

System.out.println(Arrays.toString(num1));

System.out.println(Arrays.toString(f));

int[] a = {1, 6, 3};

int[] b = {1 , 2, 3};

int[] z = b;
z[2] =11;
System.out.println(Arrays.toString(b));

System.out.println("lol: "+b.equals(z));

int[] original = {1, 2, 3};

int[] copy = Arrays.copyOf(original, 5); 

System.out.println(Arrays.toString(copy));

int[] x = new int[5];

Arrays.fill(x, 7); // All elements become 7

System.out.println(Arrays.toString(x));

String words="vbdjfbjhhsfdsn fgdvx, vxvxv, yhfhf";

String [] array=words.split(" ");
System.out.println(Arrays.toString(array));

for(int i=0;i<array.length;i++) {

System.out.println(array[i]);


}

}



}
