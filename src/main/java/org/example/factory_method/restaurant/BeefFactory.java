package org.example.factory_method.restaurant;

public class BeefFactory extends BurgerFactory{

    @Override
    protected GrilledBurger createGrilledBurger() {
        return new GrilledBeefBurger();
    }

    @Override
    protected BroiledBurger createBroiledBurger() {
        return new BroiledBeefBurger();
    }
}
