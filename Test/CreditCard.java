package Test;

public class CreditCard implements PaymentApp{
    private String cardNumber;
    private String expiryDate;

    public CreditCard(String cardNumber,String expiryDate){
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }
    @Override
    public boolean processPayment(double amount){
        return true;
    }
}
