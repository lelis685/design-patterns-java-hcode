package br.com.designpatterns.demo.adapter.payoneer;

import br.com.designpatterns.demo.adapter.utils.Token;

public class Payioneer implements IPayioneerPayments{

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void sendPayment() {
        System.out.println("pagando com payioneer");
    }

    @Override
    public void receivePayment() {
        System.out.println("recebendo pagamento com payioneer");
    }
}
