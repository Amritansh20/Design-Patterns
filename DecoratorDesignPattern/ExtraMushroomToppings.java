package DecoratorDesignPattern;

public class ExtraMushroomToppings extends ToppingsDecorator {
    BasePizza basePizza;

    public ExtraMushroomToppings(BasePizza basePizza){
        this.basePizza=basePizza;
    }

    @Override
    public int cost(){
        return basePizza.cost() + 30;
    }
    
}
