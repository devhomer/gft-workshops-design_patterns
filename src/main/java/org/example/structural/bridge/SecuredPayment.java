package org.example.structural.bridge;

public class SecuredPayment extends CreditCardPayment{

    public SecuredPayment(CreditCard creditCard){
        super(creditCard);
    }

    @Override
    public void executePay() {
        System.out.println("Secured payment executing ...");
        System.out.println(super.creditCard);
    }
}
