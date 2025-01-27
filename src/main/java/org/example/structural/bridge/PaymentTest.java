package org.example.structural.bridge;

public class PaymentTest {
    public static void main(String[] args) {
        UniversityTdc universityTdc = new UniversityTdc();
        universityTdc.validation();
        universityTdc.checkBalance();

        CreditCardPayment secured = new SecuredPayment(universityTdc);
        secured.executePay();

        System.out.println("-------");

        ClassicTdc classicTdc = new ClassicTdc();

        CreditCardPayment unsecured = new UnsecuredPayment(classicTdc);
        unsecured.executePay();



    }
}
