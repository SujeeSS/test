package com.abstraction;



public class Gpay implements Payment,Bank{


public void cost() {
	System.out.println(" node");
}
@Override

public void transaction() {

System.out.println("Gpay transaction succssfully");

}



@Override

public void withdraw() {

System.out.println("withdraw");

}



@Override

public void deposit() {

System.out.println("deposit");

}



}

///////////////////