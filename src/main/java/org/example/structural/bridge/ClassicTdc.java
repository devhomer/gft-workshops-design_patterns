package org.example.structural.bridge;

public class ClassicTdc extends CreditCard{

    @Override
    void validation() {
        System.out.println("Recovering data from card");
    }

    @Override
    void checkBalance() {
        System.out.println("Checking balance");
    }

    @Override
    public String toString() {
        return "ClassicTdc{}";
    }
}
