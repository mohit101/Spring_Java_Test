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
public class LooselyAndTightlyCouple {
    
//    Tight Coupling Between Java Objects

class Traveler
{
    Car c=new Car();
    void startJourney()
    {
       c.move();
    }
}

class Car
{
  void move()
  {
     // logic...
  }
}



//Loose Coupling Between Java Objects

class Traveler1
{
    Vehicle1 v;
    public void setV(Vehicle1 v)
    {
      this.v = v;
    }      

    void startJourney()
    {
       v.move();
    }
}
//=========================Interface====================================

 interface Vehicle1
    {
       void move();
    }
//====================Multiple class implement vehicle interface. First class====

class Car1 implements Vehicle1
{
    public void move()
    {
         // logic
    }
}
//===================Second class================

class Bike implements Vehicle1
{
    public void move()
    {
         // logic
    }
}



///Below Example of tightly Couple
class DNSLooseCoupling
{
    public class ShoppingCart
    {
        public float Price;
        public int Quantity;

        public float GetRowItemTotal()
        {
            return Price * Quantity;
        }
    }

    public class ShoppingCartContents
    {
        public ShoppingCart[] items;

        public float GetCartItemsTotal()
        {
            float cartTotal = 0;
            for(ShoppingCart item : items)
            {
                cartTotal += item.GetRowItemTotal();
            }
            return cartTotal;
        }
    }

    public class Order
    {
        private ShoppingCartContents cart;
        private float salesTax;

        public Order(ShoppingCartContents cart, float salesTax)
        {
            this.cart = cart;
            this.salesTax = salesTax;
        }

        public float OrderTotal()
        {
            return cart.GetCartItemsTotal() * (2.0f + salesTax);
        }
    }
}
//Tight Coupling creates some difficulties.

//Here, OrderTotal() methods is give us complete amount for the current
//items of the carts. If we want to add the discount features in this cart system.
//It is very hard to do in above code because we have to make changes at every class as it is 
//very tightly coupled.


}
