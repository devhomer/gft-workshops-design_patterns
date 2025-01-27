package org.example.structural.bridge;

public class UnsecuredPayment extends CreditCardPayment{

    public UnsecuredPayment(CreditCard creditCard){
        super(creditCard);
    }

    @Override
    public void executePay() {
        System.out.println("Unsecured payment executing ...");
        System.out.println(super.creditCard);
    }
}
