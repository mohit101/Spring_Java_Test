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
public class CountChar {

    public static void main(String[] args) {
        String ch = "This is something we should learn new thing";
        int count = 0, len = 0;
        while (len != 1) {
            char name[] = ch.toCharArray();
            len = name.length;
            count = 0;
            for (int j = 0; j < len; j++) {
                if ((name[0] == name[j]) && ((name[0] >= 65 && name[0] <= 91) || (name[0] >= 97 && name[0] <= 123))) {
                    count++;
                }
            }
            System.out.println(name[0] + " " + count + " Times");
            ch = ch.replace("" + name[0], "");
        }
    }
}
