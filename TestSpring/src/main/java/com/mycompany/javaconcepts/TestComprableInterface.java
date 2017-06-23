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

//Java provides Comparable interface which should be implemented by any custom class if we want to use Arrays or Collections sorting methods. 
//Comparable interface has compareTo(T obj) method which is used by sorting methods, 
//you can check any Wrapper, String or Date class to confirm this. 
//We should override this method in such a way that it returns a negative integer, zero, or a positive integer if “this” object is less than, equal to, or greater than the object passed as argument.

class HDTV implements Comparable<HDTV>{

    private int size;
    private String brand;

    public HDTV(int size, String brand) {
        this.size = size;
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public int compareTo(HDTV tv) {

        if (this.getSize() > tv.getSize()) {
            return 1;
        } else if (this.getSize() < tv.getSize()) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class TestComprableInterface {

    public static void main(String[] args) {
        HDTV tv1 = new HDTV(55, "Samsung");
        HDTV tv2 = new HDTV(60, "Sony");

        if (tv1.compareTo(tv2) > 0) {
            System.out.println(tv1.getBrand() + " is better.");
        } else {
            System.out.println(tv2.getBrand() + " is better.");
        }
    }
}

//We can easily sort STring Array, Interger Array, List Array, Which we need to
//sort any object which has some 4 to 5 argument thar Array.sort(obj) fals than we need 
//to use to implimenent comparable interface it has compareTo() method which has one object and
//return o,-1 and +1 to sort then.


//we have another interface Comparator which has overide method compare() which take to two object ans compare them\

//Comparable interface can be used to provide single way of sorting whereas Comparator interface is used to provide different ways of sorting.