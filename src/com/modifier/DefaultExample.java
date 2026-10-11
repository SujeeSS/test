package com.modifier;


//class


class DefaultExample extends PublicExample{



//default


//access - variable, method, constructor , class


//visibility - same class , same package -another class, 


// parent and child class



//variable


String name="sri";



//method


void Defaultmethod() {


System.out.println("default keyword");


}



//constructor


DefaultExample() {


System.out.println("default constructor");


}




public static void main(String[] args) {


DefaultExample d=new DefaultExample();


System.out.println(d.name);


d.Defaultmethod();



d.publicMethod();


System.out.println(d.b);


}






}

