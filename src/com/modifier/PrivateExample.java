package com.modifier;






public class PrivateExample extends DefaultExample{


//variable


private int a=10;


//method


private void display() {


System.out.println("private keywords");


}



//private



//access - variable , method


//visibility= same class



public static void main(String[] args) {


PrivateExample priv=new PrivateExample();


System.out.println(priv.a);


priv.display();


System.out.println(priv.name);


priv.Defaultmethod();



}






}


