package org.example.structural.bridge;

public class CreditCard implements CreditCardPayment{

    @Override
    public void executePay() {

    }

    public void tdcUniversityPaymentWithoutSecurity(){
        executePay();
    }

    public void tdcUniversityPaymentWithSecurity(){
        executePay();
    }

    public void tdcGoldPaymentWithoutSecurity(){
        executePay();
    }

    public void tdcGoldPaymentWithSecurity(){
        executePay();
    }

}
