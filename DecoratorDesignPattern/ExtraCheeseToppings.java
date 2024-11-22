package DecoratorDesignPattern;

public class ExtraCheeseToppings extends ToppingsDecorator{

    BasePizza basePizza;

    public ExtraCheeseToppings(BasePizza basePizza){
        this.basePizza=basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost() + 20;
    }
    
}
