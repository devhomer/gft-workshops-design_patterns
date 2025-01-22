package org.example.factory_method.restaurant;

public class VeggieFactory extends BurgerFactory{

    @Override
    protected GrilledBurger createGrilledBurger() {
        return new GrilledVeggieBurger();
    }

    @Override
    protected BroiledBurger createBroiledBurger() {
        return new BroiledVeggieBurger();
    }
}
