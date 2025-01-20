package org.example.factory_method.restaurant;

public class Restaurant{

    public Object oderBurger(String request){
        if (request.equalsIgnoreCase("BEEF")){
            BeefBurger beefBurger = new BeefBurger();
            beefBurger.prepare();
            return beefBurger;
        } else if (request.equalsIgnoreCase("VEGGIE")){
            VeggieBurger veggieBurger = new VeggieBurger();
            veggieBurger.prepare();
            return  veggieBurger;
        }
        return null;
    }

}
