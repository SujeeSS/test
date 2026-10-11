//

package com.abstraction;



public class Paytm implements Payment, Bank.Bank2,Bank{



@Override

public void transaction() {

System.out.println("paytm paymnet successfully");

}

@Override

public void withdraw() {

System.out.println("withdraw");

}



@Override

public void deposit() {

System.out.println("deposit");

}



@Override

public void netbanking() {

System.out.println("netbanking");

}

@Override
public void cost() {
	// TODO Auto-generated method stub
	
}



}

