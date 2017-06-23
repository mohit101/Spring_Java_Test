/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingletonPattern;

/**
 *
 * @author mohitm@bdcvit.com
 */
//A class which can only be initialize once
public class SingletonClass {

    private static SingletonClass instance = null;
    private static final SingletonClass INSTANCE = new SingletonClass();

    private SingletonClass() {
    }
//Way 1
    public static SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }
    
//Way2
    public static SingletonClass getInstance1() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        System.out.println("" + getInstance());
          System.out.println("" + getInstance1());
    }
}
