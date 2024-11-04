package StrategyDesignPattern.strategy;

public class BitcoinPayment implements PaymentStrategy{
    private String walletAddress;

   public BitcoinPayment(String walletAddress){
    this.walletAddress=walletAddress;
   }   

   public void pay(int amount){
    System.out.println(amount+ " is paid by bitcoin payment method");
   }
}
