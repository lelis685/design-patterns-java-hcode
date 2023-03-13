package br.com.designpatterns.demo.adapter.payoneer;

import br.com.designpatterns.demo.adapter.utils.Token;

public interface IPayioneerPayments {

    Token authToken();
    void sendPayment();
    void receivePayment();

}
