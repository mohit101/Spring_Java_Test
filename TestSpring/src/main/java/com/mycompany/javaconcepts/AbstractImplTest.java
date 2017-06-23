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
