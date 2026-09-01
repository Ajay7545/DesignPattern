package AbstractFactoryDP;

public class SinghBurger implements BurgerFactory{

    @Override
    public Burger createVegBurger() {
        return new VegBurger();
    }

    @Override
    public Burger createNonVegBurger() {
        return new NonVegBurger();
    }
}
