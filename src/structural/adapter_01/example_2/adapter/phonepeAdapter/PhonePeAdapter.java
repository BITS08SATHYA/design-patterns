package structural.adapter_01.example_2.adapter.phonepeAdapter;

import structural.adapter_01.example_2.PaymentGateway.IndianPaymentGateway;
import structural.adapter_01.example_2.PhonepePayment.PhonePePayment;

public class PhonePeAdapter implements IndianPaymentGateway {

    private PhonePePayment phonePePayment;

    public PhonePeAdapter(PhonePePayment phonePePayment) {
        this.phonePePayment = phonePePayment;
    }

    @Override
    public void processPayment(double amount) {
        phonePePayment.sendPhonePeTransaction(amount);
    }
}
