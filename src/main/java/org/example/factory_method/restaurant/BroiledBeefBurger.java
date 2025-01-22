package org.example.factory_method.restaurant;

public class BroiledBeefBurger implements BroiledBurger{
    @Override
    public void prepare(){
        System.out.println("Preparing broiled beef burger .... ");
    }
}
