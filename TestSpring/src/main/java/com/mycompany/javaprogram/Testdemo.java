/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaprogram;

/**
 *
 * @author mohitm@bdcvit.com
 */
class Test1 {

    Test1 test1 = new Test1();

    public Test1 getID(String a) {
        System.out.println("" + a);
        return test1;
    }
}

public class Testdemo {

    public static void main(String[] args) {
        Test1 test2 = new Test1();
        test2.getID("moh");
    }
}
