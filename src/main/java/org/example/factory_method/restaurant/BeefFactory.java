package org.example.factory_method.restaurant;

public class BeefFactory implements BurgerFactory{

    @Override
     public GrilledBurger createGrilledBurger() {
        return new GrilledBeefBurger();
    }

    @Override
    public BroiledBurger createBroiledBurger() {
        return new BroiledBeefBurger();
    }
}
