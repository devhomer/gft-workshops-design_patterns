package org.example.factory_method.restaurant;

public class Restaurant{

    public Burger oderBurger(String request){
        Burger burger = null;

        if (request.equalsIgnoreCase("BEEF")){
            burger = new BeefBurger();
        } else if (request.equalsIgnoreCase("VEGGIE")){
            burger = new VeggieBurger();
        }

        burger.prepare();
        return burger;
    }

}
