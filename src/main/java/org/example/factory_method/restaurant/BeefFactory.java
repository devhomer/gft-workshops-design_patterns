package org.example.factory_method.restaurant;

public class BeefFactory extends BurgerFactory{

    @Override
    protected Burger createBurger() {
        return new BeefBurger();
    }
}
