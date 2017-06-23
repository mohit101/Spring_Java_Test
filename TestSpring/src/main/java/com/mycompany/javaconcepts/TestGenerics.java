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
public class TestGenerics<T> {

    private T t;

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public static void main(String[] args) {
        String str = "x";
        int i = 1;
        float f = 1.1f;

        System.out.println("output" + runGeneric(str));
        System.out.println("output" + runGeneric(i));
        System.out.println("output" + runGeneric(f));
        System.out.println("output" + maximum(2, 4, 3));
        System.out.println("output" + maximum("x", "Z", "y"));

        //Use1
        TestGenerics<Integer> t1 = new TestGenerics<Integer>();
        t1.setT(1);
        System.out.println("output" + t1.getT());
        TestGenerics<String> t2 = new TestGenerics<String>();
        t2.setT("x");
        System.out.println("output" + t2.getT());
    }

    //Use3
    public static <G> G runGeneric(G e) {
        G x = e;
        return x;
    }

    //Use2
    public static <G extends Comparable> G maximum(G i, G j, G k) {
        G max = i;
        if (j.compareTo(max) > 0) {
            max = j;
        }
        if (k.compareTo(max) > 0) {
            max = k;
        }
        return max;
    }

}
