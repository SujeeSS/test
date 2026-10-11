package com.OOPs;



public class Main3 {

public static void main(String[] args) {

//inheritance

//class to inherit properties and actions from another class

//Single Inheritance

//When a class inherits another class, it is known as a single inheritance.

//Multilevel Inheritance

	//Hierarchical Inheritance

	Cat cat =new Cat();

	cat.meow();

	cat.eat();

	Dog dog=new Dog();

	dog.bark();

	dog.eat();

	//Hybrid Inheritance

	// two or more types of inheritance(one parent two child). 

//	vehicle -gp

//	car - pa bike

//	sport -child

	//Multiple Inheritance - java notsupport

	//diamond problem

//Hybrid Inheritance

//parent

Address address=new Address(101, "bharathi nage", "cbe");

address.displayAddress();

//child

Customer customer=new Customer(102, "ramnagar", "cbe",1111 , "sujee");

//customer.displayCustomer();

//customer.displayAddress();
SportCar s=new SportCar("car","white", 4, 4, "petrol", "Porsche 911");

s.displaySportcar();

SportCar s1=new SportCar("car","white", 4, 4, "petrol", "Tata Curvv EV");

s1.displaySportcar();

}



}