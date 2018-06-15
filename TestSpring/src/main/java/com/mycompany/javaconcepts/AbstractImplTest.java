/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/*
 It provides a facility to write an algorithm independent of any specific type of data. 
 It is gaurentee type safe.
 Generic programming enables the programmer to create classes,interfaces and methods in which type of data is specified as a parameter. It provides a facility to write an algorithm independent of any specific type of data. Generics also provide type safety. Type safety means ensuring that an operation is being performed on the right type of data before executing that operation.

Using Generics, it has become possible to create a single class ,interface or method that automatically works with all types of data(Integer, String, Float etc). It has expanded the ability to reuse the code safely and easily.

/*
package com.mycompany.javaconcepts;

/**
 *
 * @author mohitm@bdcvit.com
 */
public class AbstractImplTest extends TestAbstratcClass {

    int empId = 0;

    @Override
    public void work(String name) {
        if (name != null) {
            System.out.println("Not working");
        } else {
            System.out.println("Working as employee!!");
        }
    }

    public static void main(String[] args) {
        TestAbstratcClass abstractImplTest = new AbstractImplTest();
        abstractImplTest.work("Mohit");
    }

}
