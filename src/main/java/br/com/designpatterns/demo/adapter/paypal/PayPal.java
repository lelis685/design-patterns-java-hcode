package br.com.designpatterns.demo.adapter.paypal;

import br.com.designpatterns.demo.adapter.utils.Token;

public class PayPal implements IPayPalPayments{

    private Token token;

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.token = authToken();
        System.out.println("pagando com paypal");
    }

    @Override
    public void paypalReceive() {
        System.out.println("recebendo pagamento paypal");
    }
}
