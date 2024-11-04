package StrategyDesignPattern.strategy;

public class PaypalPayment implements PaymentStrategy{
    private String email;

    public PaypalPayment(String email){
        this.email=email;
    }

    public void pay(int amount){
        System.out.println(amount + " is paid by paypal account by user with email id "+ email);
    }
}
