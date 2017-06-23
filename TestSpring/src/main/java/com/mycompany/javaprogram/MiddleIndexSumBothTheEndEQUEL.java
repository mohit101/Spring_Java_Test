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
public class MiddleIndexSumBothTheEndEQUEL {

    public static void main(String[] args) {
        int[] num = {2, 1, 5, 1, 8};
        getIndex(num);
    }

    public static void getIndex(int[] num) {
        int start = num[0];
        int end = num.length - 1;
        for (int i = 1; i < num.length - 1; i++) {
            if (sum(0, i - 1, num) == sum(i + 1, end, num)) {
                System.out.println(i);
            }
        }
    }

    public static int sum(int a, int b, int[] num) {
        int sum = 0;
        for (int i = a; i <= b; i++) {

            sum = sum + num[i];

        }
        return sum;
    }

}
