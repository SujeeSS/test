package com.OOPs;



public class Vehicle {

String vName;

String color;

public Vehicle(String vName,String color) {

this.vName=vName;

this.color=color;

}

public void displayVehicle() {

System.out.println("vehicle type:"+vName);

System.out.println("vehicle color:"+color);

}



}