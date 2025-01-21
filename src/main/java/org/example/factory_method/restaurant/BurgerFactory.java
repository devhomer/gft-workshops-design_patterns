package org.example.factory_method.restaurant;

public abstract class BurgerFactory {

    //This is a full Factory Method Pattern
    public Burger orderBurger(){
        Burger burger = createBurger();
        burger.prepare();
        return burger;
    }

    protected abstract Burger createBurger();

}
