/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaconcepts;

/**
 *
 * @author mohitm@bdcvit.com
 */
//You cannot change contatnt of the string, you can change refrence of object. each time while you asign new value to sting in 
//it change the refernce so each time new object refernce got created
//Its also adviable use string carefullly
//== when refering same object in memory
//equel its also true when refreing same content and same and diffrent refernce
//toString method retrun the string repersentation of object also overide toString method for desire output
public class TestStringImmutable {

    public static void main(String[] args) {

        String s1 = "Mohit";
        String s2 = "Mohit";
        String s3 = new String("Mohit");
        String newstr = s3.concat("Mangal");
        System.out.println("" + s1);
        System.out.println("" + newstr);
        System.out.println("" + s3 == s1);
        System.out.println("" + s1 == s2);
        Employee employee = new Employee("mohit", "8791");
        System.out.println("" + employee);
    }

    ///If we print any Class member though object and custrutor it giving us unreadblr answare
    //by overide toString we can make them readable
}

class Employee {

    String name;
    String mobile;

    public Employee(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", mobile=" + mobile + '}';
    }
}
