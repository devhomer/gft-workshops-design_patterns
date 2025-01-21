package org.example.factory_method.restaurant;

public class SimpleBurgerFactory {

    //We call this design The Simple Factory Idiom
    public Burger createBurger(String request){
        Burger burger = null;
        if (request.equalsIgnoreCase("BEEF")){
            burger = new BeefBurger();
        } else if (request.equalsIgnoreCase("VEGGIE")){
            burger = new VeggieBurger();
        }
        return burger;
    }

}
