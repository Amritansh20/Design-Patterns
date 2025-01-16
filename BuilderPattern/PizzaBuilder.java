package BuilderPattern;

public interface PizzaBuilder {
    PizzaBuilder size(String size);
    PizzaBuilder crust(String crust);
    PizzaBuilder cheese(boolean cheese);
    PizzaBuilder pepperoni(boolean pepperoni);
    PizzaBuilder mushrooms(boolean mushrooms);
    PizzaBuilder onions(boolean onions);
    PizzaBuilder bacon(boolean bacon);
    PizzaBuilder sauceType(String sauceType);
    Pizza build();
}
