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
public class TestFebonacci {

    public static void main(String[] args) {
        int cf = 0, cn = 1;
        int d =0;
        for (int i = 0; i < 10; i++) {
            
            d = cf + cn;
            cf = cn;
            cn = d;
            System.out.println("" + d);
        }
    }
}
