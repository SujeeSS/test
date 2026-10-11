package com.error;


public class Main {

public static void main(String[] args) {

//error

// types

// Runtime Errors

// Exception handling in Java is an effective mechanism for

// managing runtime errors to ensure the application's regular flow 

// is maintained. 

// Compile-Time Errors

//block - try , catch, finally

//throw, throws - keyword

try {

System.out.println(10/0);

String name="fhdsfhsdfhs";

System.out.println(name.length());

}

catch(ArithmeticException | NullPointerException e ) {

// System.out.println(e.getMessage());

System.err.println("not using division by 0");

}

// catch (NullPointerException e) {

// System.err.println(e.getMessage());

// }

finally {

System.out.println("finally");

}

System.out.println("hello");

// try {

// 

// }

// catch (Exception e) {

// System.err.println(e.getMessage());

// }

System.out.println("world");

try { 

int a[]=new int[5];

a[0]=1;

a[1]=2;

a[2]=3;

a[3]=3;

a[4]=3;

// a[5]=5;

for(int i=0;i<a.length;i++) {

System.out.println(a[i]);

}

}

catch (ArrayIndexOutOfBoundsException e) {

System.out.println(e.getMessage());

}

System.out.println("hfhdbjsdbj");

}



}