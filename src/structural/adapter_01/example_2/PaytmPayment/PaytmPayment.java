package structural.adapter_01.example_2.PaytmPayment;

import structural.adapter_01.example_2.PaymentGateway.IndianPaymentGateway;

public class PaytmPayment implements IndianPaymentGateway {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Paytm Payment of Ruppess " + amount);
    }
}
