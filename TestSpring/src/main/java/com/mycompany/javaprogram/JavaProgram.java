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
public class JavaProgram {

    public static void main(String[] args) {
        int a = 10, b = 10, c = 1;
        if (a > b) {
            if (a > c) {
                System.out.println("a is largest");
            } else if(c > a) {
                System.out.println("c is largest");
            }
        } else if (b > c) {
            System.out.println("b is largest");
        } else if(c > b) {
            System.out.println("c is largest");
        } else if(a==b && b==c && a==c){
            System.out.println("all are equeal");
        }
    }
}
