/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaconcepts;
//Enumeration is twice as fast as compared to an Iterator and uses very less memory.
//However, the Iterator is much safer compared to Enumeration, 
//because other threads are not able to modify the collection object
//that is currently traversed by the iterator.
//Also, Iteratorsallow the caller to remove elements from the underlying 
//collection, something which is not possible with Enumerations.
/**
 *
 * @author mohitm@bdcvit.com
 */
//In some model we need specific set of values that is predefine we make them constant use enum
public enum TestEnum {

    GOOGLE("10"), YAHOO("10"), EBEY("10"), FACEBOOK("10");

    private String cname;

    private TestEnum(String cname) {
        this.cname = cname;
    }

    public String getData() {
        return cname;
    }

    public static void main(String[] args) {
        for (TestEnum comapany : TestEnum.values()) {
            System.out.println("" + comapany);
            System.out.println("" + TestEnum.EBEY);
            System.out.println(""+TestEnum.GOOGLE.getData());
        }

    }
}