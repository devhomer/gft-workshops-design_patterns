package org.example.factory_method.restaurant;

public class Restaurant{

    //public Burger oderBurger(String request){


    //}
    public static void main(String[] args) {
        BurgerFactory burgerFactory = new BeefFactory();
        Burger beefBurger = burgerFactory.orderBurger("GRILLED");

        burgerFactory = new VeggieFactory();
        Burger veggieBurger = burgerFactory.orderBurger("BROILED");
    }

}
