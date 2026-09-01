package FactoryDP;

public class NonVegBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("Its non veg burger");
    }
}
