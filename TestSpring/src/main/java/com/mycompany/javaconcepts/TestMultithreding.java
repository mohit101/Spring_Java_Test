/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaconcepts;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javafx.concurrent.Worker;

/**
 *
 * @author mohitm@bdcvit.com
 */
public class TestMultithreding implements Runnable {

    public boolean running = false;

    public TestMultithreding() {
        Thread thread = new Thread(this);
        thread.start();
    }

    public void run() {
        this.running = true;
        System.out.println("This is currently running on a separate thread, "
                + "the id is: " + Thread.currentThread().getId());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        this.running = false;
    }

    public static void main(String args[]) throws Exception {
        List<TestMultithreding> workers = new ArrayList<TestMultithreding>();
        System.out.println("This is currently running on the main thread, "
                + "the id is: " + Thread.currentThread().getId());
        Date start = new Date();
        // start 5 workers  
        for (int i = 0; i < 5; i++) {
            workers.add(new TestMultithreding());
        }

        for (TestMultithreding worker : workers) {
            while (worker.running) {
                Thread.sleep(100);
            }
        }
        Date end = new Date();
        long difference = end.getTime() - start.getTime();
        System.out.println("This whole process took: " + difference / 1000 + " seconds.");
//        TestMultithreding obj = new TestMultithreding();
//        Thread tobj = new Thread(obj);
//        tobj.start();
//        System.out.println("Main thread will be alive till the child thread is live");
//        Thread.sleep(1500);

    }

}
