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
public class Subsetsum {

    public static void main(String[] args) {

        int set[] = {3, 34, 6, 12, 5, 2};
        int sum = 13;
        isSubSet(set, 13);
    }

    public static void isSubSet(int[] a, int sum) {
        if(sum==0){
        System.out.print("exist"+sum);
        }
        for (int i = a.length - 1; i > 0; i--) {
            if (a[a.length - 1] > sum) {
                isSubSet(a, sum);
            } else {
                isSubSet(a, sum - a[a.length - 1]);
            }
        }

    }

}
