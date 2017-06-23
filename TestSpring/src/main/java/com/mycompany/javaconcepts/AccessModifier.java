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
public class AccessModifier {

    public static int data = 40;

    protected void msg() {
        System.out.println("Hello java");
    }
}

class Simple{

    public static void main(String args[]) {
        AccessModifier obj = new AccessModifier();
        System.out.println(obj.data);//Compile Time Error  
        obj.msg();//Compile Time Error  
    }
}
