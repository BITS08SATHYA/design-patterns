package structural.adapter_01.example_2.adapter.razorAdapter;

import structural.adapter_01.example_2.PaymentGateway.IndianPaymentGateway;
import structural.adapter_01.example_2.RazorPayment.RazorPayment;

public class RazorPayAdapter implements IndianPaymentGateway {

    private RazorPayment razorPayment;

//    Constructor
    public RazorPayAdapter(RazorPayment razorPayment) {
        this.razorPayment = razorPayment;
    }


    @Override
    public void processPayment(double amount) {
        razorPayment.makeRazorPayment(amount);
    }
}
