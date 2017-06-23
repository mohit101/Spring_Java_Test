/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//In Interface while implimented, that implimented class must overide all the method that declear in interface
//If you are extend abstract class then you also have to override all the method but you can also not need to override all the method using abstract keyword in subclass but then this subclass cant be initilaze this is also possible in implimented class as well with same restrictionF 
//Abstract class method cant have body as similer inferface
//implicitly interface  work as a abstract class
//Abstract can have public,private and protected method but interface can only public and default
//Abstartc class member varibale should not need final and static but interface should be
//multiple interface can impliment in one class but only one abstract class can extend
//Abstrct class can have constructor and other methods as well
package com.mycompany.javaconcepts;

/**
 *
 * @author mohitm@bdcvit.com
 */
public abstract class TestAbstratcClass {

    private String name;
    private String gender;

    //abstract method
    protected abstract void work(String name);
}
