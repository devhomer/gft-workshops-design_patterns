package org.example.structural.bridge;

public class UniversityTdc extends CreditCard{

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
        return "UniversityTdc{}";
    }
}
