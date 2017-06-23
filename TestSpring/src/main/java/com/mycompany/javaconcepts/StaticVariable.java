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
public class StaticVariable {

    static int count = 0;

    public void increment() {
        count++;
    }

    public static void main(String args[]) {
        StaticVariable obj1 = new StaticVariable();
        StaticVariable obj2 = new StaticVariable();
        StaticVariable obj3 = new StaticVariable();
        obj1.increment();
        obj2.increment();
        obj3.increment();
        System.out.println("Obj1: count is=" + obj1.count);
        System.out.println("Obj2: count is=" + obj2.count);
        System.out.println("Obj2: count is=" + obj3.count);
    }
}