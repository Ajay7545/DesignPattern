package StrategyDP;

public class CCPayment implements PaymentStrategy {

    @Override
    public void processPayment() {
        System.out.println("Payment by Credit card");
    }
}
