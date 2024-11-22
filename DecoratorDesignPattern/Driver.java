package DecoratorDesignPattern;

public class Driver {
    public static void main(String[] args) {
        BasePizza margrita = new MargritaBasePizza();
       
         // I need extra cheese;
        margrita = new ExtraCheeseToppings(margrita);
        System.out.println("***** "+margrita.cost()+" *****");

        //I need FarmHouse pizza with extra cheese and extra mashroom

        BasePizza pizza = new FarmHouseBasePizza();
        pizza = new ExtraMushroomToppings(new ExtraCheeseToppings(pizza));
        System.out.println("**** "+pizza.cost()+" *****");;
        // BasePizza pizza = new ExtraMushroomToppings(new ExtraCheeseToppings(new FarmHouseBasePizza()));
        // You can also write it above format. See how Decorater is being added
    }
}
