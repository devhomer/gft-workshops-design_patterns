package org.example.factory_method.restaurant;

public class VeggieFactory implements BurgerFactory{

    @Override
    public GrilledBurger createGrilledBurger() {
        return new GrilledVeggieBurger();
    }

    @Override
    public BroiledBurger createBroiledBurger() {
        return new BroiledVeggieBurger();
    }
}
