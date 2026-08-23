package StrategyDP;

public class ShoppingCart {

    static void main() {

    Payment upiPayment= new Payment(new UPIPayment());
    upiPayment.processPayment();
    Payment ccPayment = new Payment(new CCPayment());
    ccPayment.processPayment();

    }

}
