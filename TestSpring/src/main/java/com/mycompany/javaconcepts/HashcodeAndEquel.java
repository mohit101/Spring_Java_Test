/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaconcepts;

import java.util.Objects;

/**
 *
 * @author mohitm@bdcvit.com
 */
public class HashcodeAndEquel {

    String name;
    String mobile;

    public HashcodeAndEquel(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.name);
        hash = 71 * hash + Objects.hashCode(this.mobile);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HashcodeAndEquel other = (HashcodeAndEquel) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.mobile, other.mobile)) {
            return false;
        }
        return true;
    }

 

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        HashcodeAndEquel emp = new HashcodeAndEquel("abc", "hhh");
        HashcodeAndEquel emp2 = new HashcodeAndEquel("abc", "hhh");
        System.out.println(emp.equals(emp2));

    //}
//        System.out.println("----------------");
//        System.out.println("size of hashmap: " + h.size());
    }
}
