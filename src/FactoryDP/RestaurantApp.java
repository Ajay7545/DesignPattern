package FactoryDP;

public class RestaurantApp {
    static void main() {

        Burger burger =BurgerFactory.orderBurger("veg");
        burger.prepare();
    }
}
