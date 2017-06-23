/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryPattern;

/**
 *
 * @author mohitm@bdcvit.com
 */
//Abstract factory adds another level of abstraction to factory method. While factory method abstracts the way objects are created, abstract factory abstracts how the factories are created.
//
//factory method pattern uses inheritance while the abstract factory pattern uses composition. 
public class CreateCheese {

    Cheese cheese;

    public static void main(String[] args) {
        BaseToppingFactory sicilianToppingFactory = new SicilianToppingFactory();
        sicilianToppingFactory.createCheese("mazz");
    }
}
