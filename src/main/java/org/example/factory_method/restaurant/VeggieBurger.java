package org.example.factory_method.restaurant;

public class VeggieBurger implements Burger{

    @Override
    public void prepare(){
        System.out.println("Preparing veggie burger .... ");
    }

}
