package com.modifier;



public class StaticExample {

//variable

static int a=100;
 int b=2;
//method

public static void staticMethod() {

System.out.println("static method"+a);

}

//blocks

//types 2

//instance block

{

System.out.println("instance block");

}

//static block

static {
	

System.out.println("static block");

}

//Variables (class-level, shared across instances)

// Methods (called without object creation)

// Blocks (executed once when the class loads)

// Nested Classes (static inner classes)

public static void main(String[] args) {

// 

// StaticExample st=new StaticExample();

// System.out.println(st.a);

// a=50;

// System.out.println(a);

// 

}

}