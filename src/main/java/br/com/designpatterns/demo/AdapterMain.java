package br.com.designpatterns.demo;

import br.com.designpatterns.demo.adapter.adapters.PayioneerAdapter;
import br.com.designpatterns.demo.adapter.payoneer.Payioneer;
import br.com.designpatterns.demo.adapter.paypal.IPayPalPayments;
import br.com.designpatterns.demo.adapter.paypal.PayPal;

public class AdapterMain {

    public static void main(String[] args) {

        IPayPalPayments payments = new PayPal();
        payments.paypalPayment();
        payments.paypalReceive();

        IPayPalPayments paymentsPayioneer = new PayioneerAdapter(new Payioneer());
        paymentsPayioneer.paypalReceive();
        paymentsPayioneer.paypalPayment();


    }

}
