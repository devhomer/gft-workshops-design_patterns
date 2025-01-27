package org.example.structural.bridge;

public abstract class CreditCardPayment {

    protected CreditCard creditCard;

    protected CreditCardPayment(CreditCard creditCard){
        this.creditCard = creditCard;
    }

    public abstract void executePay();

}
