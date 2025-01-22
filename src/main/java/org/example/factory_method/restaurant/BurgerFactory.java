package org.example.factory_method.restaurant;

public abstract class BurgerFactory {


    /**
     * Al agregar una nueva receta se tiene dependencia del tipo de cocinado
     * @param typeCooked String
     * @return Burger
     */
    public Burger orderBurger(String typeCooked){
        Burger burger = null;
        if("GRILLED".equalsIgnoreCase(typeCooked)){
            burger = createGrilledBurger();
        } else if (("BROILED").equalsIgnoreCase(typeCooked)){
            burger = createBroiledBurger();
        }

        burger.prepare();
        return burger;
    }

    protected abstract GrilledBurger createGrilledBurger();
    protected abstract BroiledBurger createBroiledBurger();

}
