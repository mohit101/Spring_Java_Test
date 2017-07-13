/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

/**
 *
 * @author mohitm@bdcvit.com
 */


//When you have two threads that are reading and writing to the same 'resource', say a variable named foo, you need to ensure that these threads access the variable in an atomic way. Without the synchronized keyword, your thread 1 may not see the change thread 2 made to foo, or worse, it may only be half changed. This would not be what you logically expect.
public class ThreadExercise implements Runnable {

    Account acc = new Account();

    public static void main(String[] args) {
        ThreadExercise ts = new ThreadExercise();
        Thread t1 = new Thread(ts, "person 1");
        Thread t2 = new Thread(ts, "person 2");
        Thread t3 = new Thread(ts, "person 3");
        t1.start();
        t2.start();
        t3.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            makeWithdraw(100);
            if (acc.getBal() < 0) {
                System.out.println("account is overdrawn!");
            }
            deposit(200);
        }
    }

    private synchronized void makeWithdraw(int bal) {
        if (acc.getBal() >= bal) {
            System.out.println(Thread.currentThread().getName() + " " + "is try to withdraw");
            try {
                Thread.sleep(100);
//                acc.wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
            acc.withdraw(bal);
            System.out.println(Thread.currentThread().getName() + " " + "is complete the withdraw");
        } else {
            System.out.println(Thread.currentThread().getName() + " " + "doesn't have enough money for withdraw ");
        }
    }

    private synchronized void deposit(int bal) {
        if (bal > 0) {
            System.out.println(Thread.currentThread().getName() + " " + " is try to deposit");
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
            acc.deposit(bal);
            System.out.println(Thread.currentThread().getName() + " " + "is complete the deposit");
        } else {
            System.out.println(Thread.currentThread().getName() + " " + "doesn't have enough money for deposit");
        }
    }

}
