package BuilderPattern;

public class PizzaOrderSystem {
    public static void main(String[] args) {
        CustomPizzaBuilder builder = new CustomPizzaBuilder();
        Pizza customPizza = builder
                            .size("LARGE")
                            .cheese(true)
                            .bacon(true)
                            .crust("PAN")
                            // .onions(true)
                            .pepperoni(true)
                            .sauceType("TOTAMATO")
                            .build();

        System.out.println("Custom Pizza " + customPizza);
    }
}
