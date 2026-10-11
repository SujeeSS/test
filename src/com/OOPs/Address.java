package com.OOPs;



public class Address {

int doorno;

String StreetName;

String city;

public Address(int doorno,String StreetName,String city) {

this.doorno=doorno;

this.StreetName=StreetName;

this.city=city;

}

public void displayAddress() {

System.out.println("doorno:"+doorno);

System.out.println("street name:"+StreetName);

System.out.println("city:"+city);

}



}
