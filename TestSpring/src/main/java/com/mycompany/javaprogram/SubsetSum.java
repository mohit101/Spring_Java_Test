/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaprogram;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author mohitm@bdcvit.com
 */
public class SubsetSum {

//    public static void main(String[] args) {
//
//        int[] a = {2, 45, 7, 3, 5, 1, 8, 9};
//        printSumPairs(a, 10);
//
//    }
//
//    public static void printSumPairs(int[] input, int k) {
//        Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();
//
//        for (int i = 0; i < input.length; i++) {
//
//            if (pairs.containsKey(input[i])) {
//                System.out.println(input[i] + ", " + pairs.get(input[i]));
//            } else {
//                pairs.put(k - input[i], input[i]);
//            }
//        }
//
//    }
    
    // Returns true if there is a subset of set[] with sum
        // equal to given sum
    static boolean isSubsetSum(int set[], int n, int sum)
    {
       // Base Cases
       if (sum == 0)
         return true;
       if (n == 0 && sum != 0)
         return false;
      
       // If last element is greater than sum, then ignore it
       if (set[n-1] > sum){
         return isSubsetSum(set, n-1, sum);
       }else{
       /* else, check if sum can be obtained by any of the following
          (a) including the last element
          (b) excluding the last element   */
       return isSubsetSum(set, n-1, sum) || 
                                     isSubsetSum(set, n-1, sum-set[n-1]);
    }}
    /* Driver program to test above function */
    public static void main (String args[])
    {
          int set[] = {3, 34, 6, 12, 5, 2};
          int sum = 9;
          int n = set.length;
          if (isSubsetSum(set, n, sum) == true)
             System.out.println("Found a subset with given sum");
          else
             System.out.println("No subset with given sum");
    }
}
