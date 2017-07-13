/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaprogram;

import java.io.IOException;

/**
 *
 * @author mohitm@bdcvit.com
 */
class X {

    public static void main(String args[]) {

        int returnSomething = returnSomething();
        System.out.println("" + returnSomething);
    }

    public static int returnSomething() {

        try {
            int x = 1 / 1;
            throw new Exception();
        } catch (ArithmeticException e) {
            System.out.println("yes");
            return 2;

        } finally {
            return 3;
        }

    }
}
