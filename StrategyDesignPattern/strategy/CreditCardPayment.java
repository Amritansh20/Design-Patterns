package StrategyDesignPattern.strategy;

public class CreditCardPayment implements PaymentStrategy{
    String cardNumber;
    String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName){
        this.cardHolderName =cardHolderName;
        this.cardNumber =cardNumber;
    }

    @Override
    public void pay(int amount){
        System.out.println(amount + " paid by credit Card");
    }

}
