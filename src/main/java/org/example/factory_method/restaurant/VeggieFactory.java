package org.example.factory_method.restaurant;

public class VeggieFactory extends BurgerFactory{

    /**
     * Al agregar una nueva receta se tiene dependencia del tipo de cocinado
     * @param typeCooked
     * @return Burger
     */
    @Override
    protected Burger createBurger(String typeCooked) {
        if ("BROILED".equals(typeCooked)){
            return new BroiledVeggieBurger();
        } else {
            return new BroiledVeggieBurger();
        }
    }

}
