/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaprogram;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mohitm@bdcvit.com
 */
public class SetOfArrays {
    public static void main(String[] args) {
        int sum = 0;
        int newsum = 0;
        List<Integer> subArr = new ArrayList<Integer>();
        int[] arr = {3, 5, 4, 1, 6, 7, 2};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length - 2; j++) {
                for (int k = j; k < arr.length - 3; k++) {
                    sum = sum + arr[k];
                    if (sum < 10) {
                        sum = newsum;
                    }
                    newsum = sum;
                    if(newsum == 10) {
                        subArr.add(arr[i]);
                        System.err.println("sasa"+arr[i]);
                    }
                }

            }
        }}}
