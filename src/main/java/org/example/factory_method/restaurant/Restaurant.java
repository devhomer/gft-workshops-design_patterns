package org.example.factory_method.restaurant;

public class Restaurant{

    public static void main(String[] args) {
        BurgerFactory burgerFactory = new BeefFactory();
        Burger griledBeefBurger = burgerFactory.orderBurger("GRILLED");

        burgerFactory = new VeggieFactory();
        Burger grilledVeggieBurger = burgerFactory.orderBurger("GRILLED");

        Burger broiledVeggieBurger = burgerFactory.orderBurger("BROILED");

    }

}
