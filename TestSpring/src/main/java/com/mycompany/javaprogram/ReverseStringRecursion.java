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
public class ReverseStringRecursion {

    public static void main(String[] args) {
        String reverseString = reverseString("abcde");
        String reverseString1 = "abcdef";
//        System.out.println("" + reverseString1.substring(0, reverseString1.length()));
        System.out.println(reverseString);
        System.out.println(reverseString.charAt(1));
    }

    public static String reverseString(String str) {
        String Newstr;
        if (str == null || str.length() == 1) {
            return str;
        } else {
            Newstr = "" + str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
            System.out.println(""+Newstr);
            return Newstr;
        }

    }
}
