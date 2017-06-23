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
public class TestExceptions {
//Error are series problem that are abnormal which occur while occure make terminate a
//the program nd fall in infinate loop EX-Memory Error, Hadware Error JVM Error.

//Exception are soming that is present in Code
//Checked Exception(compile time) that are handle before the program excution those are not handled give compile time error
//Ex-ClassNotFoundException
//IllegalAccessException
//NoSuchFieldException
//Compile time error those who can be handle before program Exceution
//Run time(Unchecked ) error occure while execution of program which do not check during comiple time

// Ex.
//ArithmeticException
//ArrayIndexOutOfBoundsException
//NullPointerException
    
    public static void main(String[] args) {
//        try {
//                //If you load the class using class.forName and that specified class not found in classPath called
//            //Class not found Exception
////            Class.forName("mysql.jdbc.driver.MySqlDriver");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }

        Percentage percentage = new Percentage(121);
        System.out.println(percentage.getValue());

        {
            //While run this two .class file is generated A and B and if you remove .classA file 
            //that at complie time error occure classdefnot present
            A a = new A();
        }
    }
}

class A {
  // some code
}

final class Percentage {

    private final int value;

    Percentage(int value) {
        if (value < 0 || value > 100) {
            throw new IllegalArgumentException(Integer.toString(value));
        }
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
