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
public class CountcharRecursion {

    public static void main(String[] args) {
        System.out.println(countCharFromString("abcddkecaea"));
    }

    public static int countCharFromString(String str) {
        int count = 0;
        int i = 1;
        if (str.length() == 0) {
            return 0;
        } else {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'a') {
                    count++;
                }
            }
        return count;
    }
    }
}
