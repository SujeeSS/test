package com.OOPs.polymorphism;



public class ChildClass extends ParentClass {



public void add(int a, int b) {

System.out.println(a + b + "child");



}

//ctrl+alt+downarrow 

//alt + down arrow

public static void main(String[] args) {

// ParentClass pa=new ParentClass();

// pa.add(10, 100);



// ChildClass ch=new ChildClass(); //static binding

// ch.add(10, 20);



// dynamic binding

ParentClass pa1 = new ChildClass();

pa1.add(10, 10);



// binding

// Connecting a method call to the method body is known as binding.

// There are two types of binding

// 1.Static Binding (also known as Early Binding).

// 2.Dynamic Binding (also known as Late Binding).

}



}
