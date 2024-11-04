package StrategyDesignPattern;

import StrategyDesignPattern.strategy.PaymentStrategy;

public class ShoppingCart {
    PaymentStrategy paymentStrategy;
    
    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy=paymentStrategy;
    }

    public void checkOut(int amount){
        if(paymentStrategy==null){
            System.out.println("No Payment Startegy Selected");
        }else{
            paymentStrategy.pay(amount);
        }
    }


}
