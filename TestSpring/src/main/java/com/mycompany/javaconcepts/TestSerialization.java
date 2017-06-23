/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.javaconcepts;

import java.io.Serializable;

/**
 *
 * @author mohitm@bdcvit.com
 */


//So, implement the Serializable interface when you need to store a copy of the object, send them it to another process on the same system or over the network.
//Because you want to store or send an object.
//It makes storing and sending objects easy. It has nothing to do with security


public class TestSerialization implements Serializable{
    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

