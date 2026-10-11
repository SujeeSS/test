package com.OOPs;



public class SportCar extends Car{

String modelNo;



public SportCar(String vName, String color, int door, int wheel, String engineType,String modelNo) {

super(vName, color, door, wheel, engineType);

this.modelNo=modelNo;

}

public void displaySportcar() {

System.out.println("display the sports car details");

System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

super.displayVehicle();

super.displayCar();

System.out.println("modelno:"+modelNo);

}



}