package payment;

import java.util.Objects;

public class PayPalPayment implements  PaymentProcessor{
public String email;
public String name;
public String transactionId;
public double accountBalance;

public double transactionAmount;

    public PayPalPayment(String email, String name, String transactionId) {
        this.email = email;
        this.name = name;
        this.transactionId = transactionId;
    }

    public String getTransactionId() {
        return transactionId;
    }
    public boolean paymentStatus(PayPalPayment payment, String transactionId, String email, double accountBalance){
        if(Objects.equals(transactionId, payment.getTransactionId())){
            processPayment();
            return true;
        }
        refundPayment();
        return false;
    }
    @Override
    public void processPayment() {
        this.transactionId = String.valueOf(0);
        accountBalance = accountBalance - transactionAmount;
    }

    @Override
    public void refundPayment() {
        this.transactionId = String.valueOf(0);
        accountBalance = accountBalance + transactionAmount;

    }
}
