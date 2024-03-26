package Test;

public class PayPal implements PaymentApp{
    private String email;

    public PayPal(String email){
        this.email = email;
    }

    @Override
    public boolean processPayment(double amount){
        return true;
    }
}
