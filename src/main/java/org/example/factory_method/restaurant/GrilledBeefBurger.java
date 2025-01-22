package org.example.factory_method.restaurant;

/***
 * se agrega ua nueva receta al menu
 */
public class GrilledBeefBurger implements Burger{

    @Override
    public void prepare() {
        System.out.println("Preparing grilled beef burger .... ");
    }
}
