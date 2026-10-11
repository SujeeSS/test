package com.OOPs;



public class AadharCard {

private long aadharno=567843218907L;

char initial='V';

String name="Allen";

String Date="05-06-2005";

public long getAadharNo() {

return aadharno;

}

public void setName(String name) {

this.name=name;

}

public String getName() {

return name;

}

public static void main(String[] args) {

AadharCard card=new AadharCard();

System.out.println("aadharno:"+card.aadharno);

}



}