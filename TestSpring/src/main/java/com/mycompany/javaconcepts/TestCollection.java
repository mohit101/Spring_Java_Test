/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaconcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author mohitm@bdcvit.com
 */
public class TestCollection {

    String name = null;
    String mobNo = null;

    public TestCollection(String name, String mobile) {
        this.name = name;
        this.mobNo = mobNo;
    }

    public static void main(String[] args) {
        TestCollection testCollection1 = new TestCollection("Mohit", "879123");
        TestCollection testCollection2 = new TestCollection("Mohit", "879123");

//        System.out.println("" + testCollection1.equals(testCollection2));
//        convertArraytoList();
//        replaceElemnentFromList();
//        setUse();
//        hasgMapUse();
        ListUse();

    }

    public static List<String> convertArraytoList() {
        String[] name = new String[]{"a", "b", "c"};
        List<String> list = Arrays.asList(name);
        for (String li : list) {
            System.out.print(li + " ");
        }
        return list;
    }

    public static void replaceElemnentFromList() {
        List list = Arrays.asList("one Two three Four five six one three Four".split(" "));
        System.out.println("List :" + list);
        Collections.replaceAll(list, "one", "hundread");
        System.out.println("replaceAll: " + list);
    }

    public static void ListUse() {
        List<String> names = new ArrayList<String>();
        List<String> names1 = new ArrayList<String>();
        names1.add("10");
        names1.add("20");
        System.out.println(""+names1);
        for(int i=0; i<10; i++){
        names.add("Tom");
        names.add("Marry");
        names.add("Marry");
        names.add("Marry");
        names.add("Darry");}
        names.add("");
        names.add("");
        System.out.println("" + names.indexOf("Marry"));
        System.out.println("" + names.size());
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String next = it.next();
            System.out.println("" + next);
        }
//        for (String name : names) {
//            System.out.println("Out" + name);
//        }
    }

    public static void setUse() {
        Set<String> names = new HashSet<String>();
        names.add("Tom");
        names.add("Tom");
        names.add("");
        names.add("");
        System.out.println("" + names.size());
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String next = it.next();
            System.out.println("" + next);
        }
//        for (String name : names) {
//            System.out.println("Out" + name);
//        }
    }

    public static void hasgMapUse() {
        Map<String, String> hashmap = new HashMap<String, String>();
        hashmap.put("mohit", "10%");
        hashmap.put("mohit", "100%");
        hashmap.put("sohit", "60%");
        hashmap.put("rohit", "40%");
        hashmap.put("pohit", "40%");
        hashmap.put("pohit", "1");

        for (Map.Entry<String, String> entry : hashmap.entrySet()) {
            System.out.println("" + entry.getKey() + "" + entry.getValue());
        }
    }

//list.toArray() for convert list into Array 
    //list and set iterate through foreach and iteretor both, list allow duplicate, List Maintain Order
    //hashMap iterate through Iterator and for Each too hashmap.entrySet also not support duplicate
    //Set iterate through both
    //Set are not Allowed duplicate 
    //ArrayList internally Maintain intex for each elemnt
    //HashMap  Maintain intex along with value for each elemnt so high memory consuption
    //List internally used array as datastrure and Map also used array ds 
    //HashSet internally use HashMap in java
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        TestCollection other = (TestCollection) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        return true;
    }

    public void testContainsAll() {
        List<String> one = new ArrayList<String>();
        List<String> two = new ArrayList<String>();
        one.add("1");
        one.add("2");
        one.add("3");
        two.add("1");
        two.add("2");
        two.add("3");

        boolean checkflag = one.containsAll(two);

    }
}
//This method checks if some other object passed to it as an argument is equal to the object on which this method is invoked
//t checks if x == y. This particular comparison is also known as "shallow comparison". However, the classes providing their own implementations of the equals method are supposed to perform a "deep comparison";
//This method returns the hash code value for the object on which this method is invoked. 
//This method returns the hash code value as an integer and is supported for the benefit of hashing based collection classes such as Hashtable, HashMap, HashSet etc. 
//This method must be overridden in every class that overrides the equals method.

