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
 class Employees {

    float salary = 40000;
}

public class TestInheritence extends Employees {

    int bonus = 10000;

    public static void main(String args[]) {
        TestInheritence p = new TestInheritence();
        System.out.println("Programmer salary is:" + p.salary);
        System.out.println("Bonus of Programmer is:" + p.bonus);
    }
}
