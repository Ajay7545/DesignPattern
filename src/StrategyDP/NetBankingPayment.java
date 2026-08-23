package StrategyDP;

public class NetBankingPayment implements PaymentStrategy {

    @Override
    public void processPayment() {
        System.out.println("net banking paid");
    }
}
