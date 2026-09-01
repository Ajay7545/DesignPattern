package AbstractFactoryDP;

public class RestroApp {
    static void main() {

        BurgerFactory burgerFactory= new SinghBurger();
        Burger vegBurger= burgerFactory.createVegBurger();
        Burger nonVegBurger= burgerFactory.createNonVegBurger();
        vegBurger.prepare();
        nonVegBurger.prepare();
    }
}
