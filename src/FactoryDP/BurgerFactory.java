package FactoryDP;

public class BurgerFactory {

    public static Burger orderBurger(String type){
        if(type.equals("veg")){
            return new VegBurger();
        }
        else {
            return new NonVegBurger();
        }
    }
}
