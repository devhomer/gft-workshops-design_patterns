package org.example.factory_method.restaurant;

public class BeefFactory extends BurgerFactory{

    /**
     * Al agregar una nueva receta se tiene dependencia del tipo de cocinado
     * @param typeCooked
     * @return Burger
     */
    @Override
    protected Burger createBurger(String typeCooked) {

        if ("GRILLED".equals(typeCooked)){
            return new GrilledBeefBurger();
        } else {
            return new BroiledBeefBurger();
        }

    }
}
