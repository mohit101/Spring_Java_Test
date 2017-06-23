/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaconcepts;

/**
 *
 * @author mohitm@bdcvit.com
 */
//We can use overing while implimenting method that are decleared in Interface
//Subclass has same method that are impliment in superclass, It use run time polimorphism
///must be IS-A relationship (inheritance)
//static method bound with class class area so cant to overide
//instance method bound with object so heap area and can overide
//java 1.6 provide facility use @override Annotation in while impliment interface
//Clild access parent class but parent cant acces child class
//We cant access multiples parent classes same method in chile class its ambiguty and java is simple language

//Inheritance refers to using the structure and behaviour of a super class in a subclass.

//Polymorphism refers to changing the behaviour of a super class in the subclass.
//So, it means using Inheritance which is one of the way to achieve polymorphism.
//Polymorhism can be possible in a class / interface but Inheritance always between 2 OR more classes / interfaces. Inheritance always conform "is-a" relationship whereas it is not always with Polymorphism (which can conform both "is-a" / "has-a" relationship.

//Extends : we creating new class(Inherited class) with the features of Exsisting (class Base class) and some additional features. This comes in picture in case of inheritence.
//
//Example: NokiaBasic Handset. NokiaNSeries(Extends the features of NokiaBasic Handset features)
//
//Overriding: comes to picture when functionality changes in derived class. We override the functionality of perticular function in derived class(Dynamic Polymarphism).
//
//Example: All the functionality which NokiaBasicHandset has ,are implemented in NokiaNSeries but there is a difference in the way we operate.(Picking a call,sending message,sharing file..ETC)
class Bank {

    int rate = 10;

    int getRateOfInterest() {
        return rate;
    }
}

class SBI extends Bank {

    int getRateOfInterest() {
        return rate + 1;
    }
}

class ICICI extends Bank {

    int getRateOfInterest() {
        return rate + 2;
    }
}

class AXIS extends Bank {

    int getRateOfInterest() {
        return rate + 3;
    }
}

public class TestOverideing {

    public static void main(String args[]) {
        //Base object cant store in chiled SBI s=new Bannk();

        Bank s = new SBI();
        Bank i = new ICICI();
        AXIS a = new AXIS();
        System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: " + i.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: " + a.getRateOfInterest());
    }

}
//nheritance refers to using the structure and behaviour of a super class in a subclass.
//
//Polymorphism refers to changing the behaviour of a super class in the subclass.

//Inheritance: This is one way of achieving both Polymorphism and code reuse at the same time.

//