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
public abstract class BaseToppingFactory {

    int x;
    int y;

    public abstract Cheese createCheese(String s);

    public abstract Sauce createSauce(String s);

//    public abstract Sauce createPizza(String s);
//    public abstract Sauce createFrenceFries(String s);
//    public abstract Sauce createBurger(String s);
}
