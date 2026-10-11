
package com.modifier;






public class Main {






public static void main(String[] args) {



//modifier


// modifiers are keywords used to define the characteristics and behavior 


// of classes, methods, and variables



//1. accessmodifier


//public, private, default, protected


// These modifiers control the accessibility or visibility of


// classes, methods, variables, and constructors. 



DefaultExample d=new DefaultExample();

System.out.println(d.name);

d.Defaultmethod();



PublicExample pub=new PublicExample();

System.out.println(pub.b);

pub.publicMethod();



ProtectedExample pro = new ProtectedExample();

System.out.println(pro.p);

pro.PM();

//2.non- accessmodifier


//static, final, abstraction, sync, 




}


}