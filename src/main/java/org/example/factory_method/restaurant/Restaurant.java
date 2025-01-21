package org.example.factory_method.restaurant;

public class Restaurant{

    public Burger oderBurger(String request){
        SimpleBurgerFactory factory = new SimpleBurgerFactory();
        Burger burger = factory.createBurger("VEGGIE");
        burger.prepare();
        return burger;
    }

}
