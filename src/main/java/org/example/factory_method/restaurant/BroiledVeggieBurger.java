package org.example.factory_method.restaurant;

public class BroiledVeggieBurger implements Burger{

    @Override
    public void prepare(){
        System.out.println("Preparing broiled veggie burger .... ");
    }

}
