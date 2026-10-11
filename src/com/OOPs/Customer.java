package com.OOPs;



public class Customer extends Address{

int cusId;

String custName;

public Customer(int doorno, String StreetName, String city, int cusId, String custName) {

super(doorno, StreetName, city);

this.cusId=cusId;

this.custName=custName;

}

public void displayCustomer(){

System.out.println("display details");

System.out.println("customet ID:"+cusId);

System.out.println("customername:"+custName);

// super.displayAddress();
}
}