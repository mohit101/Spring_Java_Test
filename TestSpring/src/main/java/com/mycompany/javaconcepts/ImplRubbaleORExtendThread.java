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

//Use Runnable interface when you want to access the same resource from the group of threads. Avoid using Thread class here, because multiple objects creation consumes more memory and it becomes a big performance overhead.
//
//A class that implements Runnable is not a thread and just a class. For a Runnable to become a Thread, You need to create an instance of Thread and passing itself in as the target.
//
//In most cases, the Runnable interface should be used if you are only planning to override the run() method and no other Thread methods. This is important because classes should not be subclassed unless the programmer intends on modifying or enhancing the fundamental behavior of the class.
//
//When there is a need to extend a superclass, implementing the Runnable interface is more appropriate than using the Thread class. Because we can extend another class while implementing Runnable interface to make a thread.


//Implement Runnable Interface...
 class ImplementsRunnable implements Runnable {

private int counter = 0;

public void run() {
    counter++;
    System.out.println("ImplementsRunnable : Counter : " + counter);
 }
}

//Extend Thread class...
class ExtendsThread extends Thread {

private int counter = 0;

public void run() {
    counter++;
    System.out.println("ExtendsThread : Counter : " + counter);
 }
}

public class ImplRubbaleORExtendThread {
    
public static void main(String args[]) throws Exception {
    // Multiple threads share the same object.
    ImplementsRunnable rc = new ImplementsRunnable();
    Thread t1 = new Thread(rc);
    t1.start();
    Thread.sleep(1000); // Waiting for 1 second before starting next thread
    Thread t2 = new Thread(rc);
    t2.start();
    Thread.sleep(1000); // Waiting for 1 second before starting next thread
    Thread t3 = new Thread(rc);
    t3.start();

    // Creating new instance for every thread access.
    ExtendsThread tc1 = new ExtendsThread();
    tc1.start();
    Thread.sleep(1000); // Waiting for 1 second before starting next thread
    ExtendsThread tc2 = new ExtendsThread();
    tc2.start();
    Thread.sleep(1000); // Waiting for 1 second before starting next thread
    ExtendsThread tc3 = new ExtendsThread();
    tc3.start();
 }
}
