package com.OOPs.polymorphism;



public class Main {

public void add(int a, int b) {

System.out.println(a+b);

} 

public void add(String name, int age) {

System.out.println(name+age);

}

public static void main(String[] args) {

//Polymorphism in Java

// which we can perform a single action in different ways.

//Types of Polymorphism

// There are two types of polymorphism in Java:

//

// Compile-time Polymorphism - method overloading

// method overloading-In same class, methods with the same name but different parameter is method overloading.

// Runtime Polymorphism. - method overriding

Main main=new Main();

main.add(10, 10);

main.add("sri", 20);

main.add("sujee", 29);

}



}