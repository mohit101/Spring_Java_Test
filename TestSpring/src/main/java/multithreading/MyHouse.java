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
    class MyHouse {
            
    private boolean pizzaArrived = false;

    public  void eatPizza() throws Exception{
        synchronized(this){
            while(!pizzaArrived){
                wait();
            }
        }
        System.out.println("yumyum..");
    }

    public  void pizzaGuy(){
        synchronized(this){
             this.pizzaArrived = true;
             notifyAll();
        }
    }
    

}
