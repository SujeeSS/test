package com.modifier;


//class


public class PublicExample extends ProtectedExample {



//variable


public int b=20;



//constructor


public PublicExample() {


System.out.println("public constructor");


}



//method


public void publicMethod() {


System.out.println("public method");


}



public static void main(String[] args) {


PublicExample pub=new PublicExample();


System.out.println(pub.b);


pub.publicMethod();

// Protect test

System.out.println(pub.p);

pub.p=10;
pub.PM();


}






}

