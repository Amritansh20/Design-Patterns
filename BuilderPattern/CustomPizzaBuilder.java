package BuilderPattern;

public class CustomPizzaBuilder implements PizzaBuilder{
    Pizza pizza;

    public CustomPizzaBuilder(){
        this.pizza= new Pizza();

    }
    @Override
    public PizzaBuilder size(String size) {
        if (size == null || size.trim().isEmpty()) {
            throw new IllegalArgumentException("Size cannot be null or empty");
        }
        this.pizza.size = size;
        return this;
    }

    @Override
    public PizzaBuilder crust(String crust) {
        if (crust == null || crust.trim().isEmpty()) {
            throw new IllegalArgumentException("Crust type cannot be null or empty");
        }
        this.pizza.crust = crust;
        return this;
    }

    @Override
    public PizzaBuilder cheese(boolean cheese) {
        this.pizza.cheese = cheese;
        return this;
    }

    @Override
    public PizzaBuilder pepperoni(boolean pepporini) {
        this.pizza.pepporini = pepporini;
        return this;
    }

    @Override
    public PizzaBuilder mushrooms(boolean mushrooms) {
        this.pizza.mushrooms = mushrooms;
        return this;
    }

    @Override
    public PizzaBuilder onions(boolean onions) {
        this.pizza.onions = onions;
        return this;
    }

    @Override
    public PizzaBuilder bacon(boolean bacon) {
        this.pizza.bacon = bacon;
        return this;
    }

    @Override
    public PizzaBuilder sauceType(String sauceType) {
        if (sauceType == null || sauceType.trim().isEmpty()) {
            throw new IllegalArgumentException("Sauce type cannot be null or empty");
        }
        this.pizza.sauceType = sauceType;
        return this;
    }

    @Override
    public Pizza build() {
        if (pizza.size == null || pizza.crust == null || pizza.sauceType == null) {
            throw new IllegalStateException("Pizza must have size, crust, and sauce type");
        }

        Pizza completePizza = this.pizza;
        // this.pizza = new Pizza(); // Reset for next build
        return completePizza;
    }
    
}
