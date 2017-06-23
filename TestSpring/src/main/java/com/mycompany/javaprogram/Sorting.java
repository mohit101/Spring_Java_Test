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
public class Sorting {

    public static void main(String[] args) {
        int[] num = {7, 8, 1, 2, 3, 5};
        int[] sort = sort(num);
        for (int x = 0; x < sort.length; x++) {
            System.out.println("" + sort[x]);
        }
    }

    public static int[] sort(int[] num) {
        for (int i = 0; i <= num.length - 1; i++) {
            for (int j = i + 1; j <= num.length - 1; j++) {
                if (num[i] > num[j]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        return num;
    }
}
