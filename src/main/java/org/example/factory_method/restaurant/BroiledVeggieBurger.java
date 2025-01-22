package org.example.factory_method.restaurant;

public class BroiledVeggieBurger implements BroiledBurger{

    @Override
    public void prepare(){
        System.out.println("Preparing broiled veggie burger .... ");
    }

}
