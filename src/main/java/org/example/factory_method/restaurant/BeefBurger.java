package org.example.factory_method.restaurant;

public class BeefBurger implements Burger{
    @Override
    public void prepare(){
        System.out.println("Preparing beef burger .... ");
    }
}
