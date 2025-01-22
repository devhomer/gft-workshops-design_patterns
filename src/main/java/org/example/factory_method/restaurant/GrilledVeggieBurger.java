package org.example.factory_method.restaurant;

/***
 * se agrega ua nueva receta al menu
 */
public class GrilledVeggieBurger implements Burger{

    @Override
    public void prepare(){
        System.out.println("Preparing grilled veggie burger .... ");
    }

}
