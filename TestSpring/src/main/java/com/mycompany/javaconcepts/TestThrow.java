/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaconcepts;

import java.util.Scanner;

/**
 *
 * @author mohitm@bdcvit.com
 */
public class TestThrow {

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);  //Declaring Scanner variable to take input from user

        System.out.println("Enter Your Age");

        int age = sc.nextInt();         //Taking input from user

        try {
            if (age < 0) {
                throw new AgeIsNegativeException("shoud not negative");    //throws AgeIsNegativeException if age is negative
            }
        } catch (AgeIsNegativeException ex) {
            throw new AgeIsNegativeException("shoud not negative");
//            System.out.println(ex);    //Output : Age can not be negative
        }
    }
}

class AgeIsNegativeException extends Exception {

    String errorMessage;

    public AgeIsNegativeException(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    //Modifying toString() method to display customized error message
    @Override
    public String toString() {
        return errorMessage;
    }
}
