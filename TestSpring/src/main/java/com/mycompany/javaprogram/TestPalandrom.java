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
public class TestPalandrom {
    
    public static void main(String[] args) {
        int n = 1221;
        int rem = 0;
        int sum = 0;
//        while (n != 0) {
//            
//            rem = n % 10;
//            n = n / 10;
//            sum = sum*10 + rem;
//            System.out.println("" + sum);
//
//        }
        
        String str1= "mohit";
        char[] str=str1.toCharArray();
        int f=0;
        int l=str.length-1;
        while(l>f){
        if(str[f++] != str[l--]){
            System.out.println("palandrom");
        }
        else
        {
            System.out.println("Not palandrom");
        }
        }
        
    }
    
}

//}
