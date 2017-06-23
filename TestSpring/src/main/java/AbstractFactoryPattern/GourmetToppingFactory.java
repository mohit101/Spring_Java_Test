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
public   class GourmetToppingFactory extends BaseToppingFactory {
    
    @Override
    public Cheese createCheese(String s){return new GoatCheese();}
    @Override
    public Sauce createSauce(String s){return new TomotoSauce();}

}
