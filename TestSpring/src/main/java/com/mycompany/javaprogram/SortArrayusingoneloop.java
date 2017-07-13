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
public class SortArrayusingoneloop {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int[] arr = new int[]{10, 2, 20, 4, 0, 40, 38, 34};
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                System.out.println("" + i);
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
                i = 0;
            }
        }
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Time Taken  " + totalTime);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println("" + arr[i]);
        }
    }
}
