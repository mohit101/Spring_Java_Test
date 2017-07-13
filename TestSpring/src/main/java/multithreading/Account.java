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
public class Account {
     int balance= 1000;

    public int getBal(){
        return balance;
    }

    public void withdraw(int bal){
        balance= balance-bal;
    }

    public void deposit(int bal){
        balance= balance+bal;
    }
}
