package structural.adapter_01.example_2;

import structural.adapter_01.example_2.PaymentGateway.IndianPaymentGateway;
import structural.adapter_01.example_2.PaytmPayment.PaytmPayment;
import structural.adapter_01.example_2.PhonepePayment.PhonePePayment;
import structural.adapter_01.example_2.RazorPayment.RazorPayment;
import structural.adapter_01.example_2.adapter.phonepeAdapter.PhonePeAdapter;
import structural.adapter_01.example_2.adapter.razorAdapter.RazorPayAdapter;

public class app {
    public static void main(String[] args) {

        IndianPaymentGateway paytm = new PaytmPayment();
        paytm.processPayment(500);

        RazorPayment razorPay = new RazorPayment();
        IndianPaymentGateway razorPayAdapter = new RazorPayAdapter(razorPay);
        razorPayAdapter.processPayment(200);

        PhonePePayment phonePePay = new PhonePePayment();
        IndianPaymentGateway phonePeAdapter = new PhonePeAdapter(phonePePay);
        phonePeAdapter.processPayment(300);
    }
}
