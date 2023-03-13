package br.com.designpatterns.demo.adapter.adapters;

import br.com.designpatterns.demo.adapter.payoneer.Payioneer;
import br.com.designpatterns.demo.adapter.paypal.IPayPalPayments;
import br.com.designpatterns.demo.adapter.utils.Token;

public class PayioneerAdapter implements IPayPalPayments {

    private Token token;
    private Payioneer payioneer;

    public PayioneerAdapter(Payioneer payioneer) {
        this.payioneer = payioneer;
        System.out.println("adaptando payoneer utilizando metodos do paypal");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        payioneer.sendPayment();
    }

    @Override
    public void paypalReceive() {
        payioneer.receivePayment();
    }
}
