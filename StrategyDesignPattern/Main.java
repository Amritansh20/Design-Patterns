package StrategyDesignPattern;

import StrategyDesignPattern.strategy.CreditCardPayment;
import StrategyDesignPattern.strategy.PaypalPayment;

public class Main {
    
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new PaypalPayment("amritansh.soni20@gmail.com"));
        cart.checkOut(100);

        cart.setPaymentStrategy(new CreditCardPayment("123456789", "Amritansh"));
        cart.checkOut(1200);
    }
}
