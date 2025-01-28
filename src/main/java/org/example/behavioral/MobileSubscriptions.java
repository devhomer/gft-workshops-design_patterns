package org.example.behavioral;

public class MobileSubscriptions implements SubscriptionChannel{
    private final String user;

    public MobileSubscriptions(String user){
        this.user = user;
    }

    public void update(){
        System.out.println("Store: Ultimas piezas");
        System.out.println("Hola " + user +" tu producto esta disponible en la app.");
        System.out.println("-----------------------------------------");
    }
}
