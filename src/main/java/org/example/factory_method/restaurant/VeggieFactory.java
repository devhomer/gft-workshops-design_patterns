package org.example.factory_method.restaurant;

public class VeggieFactory extends BurgerFactory{
    @Override
    protected Burger createBurger() {
        return new VeggieBurger();
    }
}
