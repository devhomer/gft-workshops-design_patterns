package org.example.factory_method.restaurant;

public abstract class BurgerFactory {


    /**
     * Al agregar una nueva receta se tiene dependencia del tipo de cocinado
     * @param typeCooked String
     * @return Burger
     */
    public Burger orderBurger(String typeCooked){
        Burger burger = createBurger(typeCooked);
        burger.prepare();
        return burger;
    }

    protected abstract Burger createBurger(String typeCooked);

}
