package StrategyDP;

public class Payment implements PaymentStrategy  {
    PaymentStrategy paymentStrategy;

    public Payment(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    @Override
    public void processPayment() {
        paymentStrategy.processPayment();

    }
}
