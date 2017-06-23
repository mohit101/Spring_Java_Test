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
public class SicilianToppingFactory extends BaseToppingFactory {

    @Override
    public Cheese createCheese(String s) {
        if (s == "goat") {
            return new GoatCheese();
        }
        if (s == "mazz") {
            return new MozzarellaCheese();
        }
        return null;
    }

    @Override
    public Sauce createSauce(String s) {
        if (s == "tomoto") {
            return new TomotoSauce();
        }
        return null;
    }
}
