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
public class FindDuplicate {

    public static void main(String[] args) {
        int dup;
        Integer[] ar = new Integer[]{1, 2, 3, 4, 2, 3, 6, 8,7, 7, 6};
        dup = ar[0];
        for (int i = 1; i < ar.length; i++) {
            for (int j = i; j < ar.length; j++) {
                if (dup == ar[j]) {
                    System.out.println("" + dup);
                }
            }
            dup = ar[i];
        }
    }

}
