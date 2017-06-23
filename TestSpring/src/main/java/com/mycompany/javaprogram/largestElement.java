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
public class largestElement {

    public static void main(String[] args) {
        int largest = 0, secondlargest = 0;
        Integer[] arr = new Integer[]{1, 15, 20, 50, 3};
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                secondlargest = largest;
                largest = arr[i];
            }
        }
        System.out.println("" + secondlargest);
    }

}
