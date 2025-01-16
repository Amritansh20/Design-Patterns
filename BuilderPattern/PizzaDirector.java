package BuilderPattern;

public class PizzaDirector {
    private PizzaBuilder pizzaBuilder;

    public PizzaDirector(PizzaBuilder pizzaBuilder){
        this.pizzaBuilder=pizzaBuilder;
    }

    public Pizza createMargreta(){
        return pizzaBuilder
            .size("MEDIUM")
            .crust("THIN")
            .cheese(true)
            .sauceType("TOMAOTO")
            .build();
    }

    public Pizza createPepperoniPizza() {
        return pizzaBuilder
                .size("LARGE")
                .crust("REGULAR")
                .cheese(true)
                .pepperoni(true)
                .sauceType("TOMATO")
                .build();
    }
}
