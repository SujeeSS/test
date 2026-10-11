package com.OOPs;



public class Car extends Vehicle{

int door;

int wheel;

String engineType;

public Car(String vName, String color,int door,int wheel,String engineType) {

super(vName, color);

this.door=door;

this.wheel=wheel;

this.engineType=engineType;

}

public void displayCar() {

System.out.println("number of door:"+door);

System.out.println("number of wheels:"+wheel);

System.out.println("engine type:"+engineType);

}





}

