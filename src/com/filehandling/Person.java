package com.filehandling;



import java.io.Serializable;



public class Person implements Serializable{

	

	int pId;

	String name;

	int age;

	

	public Person(int pId, String name, int age) {

		this.pId = pId;

		this.name = name;

		this.age = age;

	}

	

	



}