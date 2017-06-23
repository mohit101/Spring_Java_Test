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
//Same name with diffrent argument is overloading
public class TestOverloading {

    public void x(int a, int b) {
        System.out.println("X a and b success" + a + b);
    }

    public void x(int a) {
        System.out.println("a success" + a++);
    }

    public void x(String a, long b) {
        System.out.println("a string b long success" + a + "sal" + b);
    }

    public static void main(String[] args) {
        TestOverloading testOverloading = new TestOverloading();
        testOverloading.x(1, 2);
        testOverloading.x(1);
        testOverloading.x("hello", 200000);
    }

}
