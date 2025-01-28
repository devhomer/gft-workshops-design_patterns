package org.example.behavioral;

public class EmailSubscriptions {

    private final String email;
    private final String user;

    public EmailSubscriptions(String email, String user){
        this.email = email;
        this.user = user;
    }

    public void update(){
        System.out.println("Send to :  "  + email);
        System.out.println("Hola " + user +" tu producto esta disponible.");
        System.out.println("-----------------------------------------");
    }

}
