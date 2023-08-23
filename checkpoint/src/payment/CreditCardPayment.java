package payment;

import java.util.Objects;

public class CreditCardPayment implements PaymentProcessor{
    public String cardNumber;
    public String name;
    public String transactionId;
    public double accountBalance;

    public CreditCardPayment(String cardNumber, String name, String transactionId, double accountBalance, double transactionAmount) {
        this.cardNumber = cardNumber;
        this.name = name;
        this.transactionId = transactionId;
        this.accountBalance = accountBalance;
        this.transactionAmount = transactionAmount;
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

    public double transactionAmount;
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
