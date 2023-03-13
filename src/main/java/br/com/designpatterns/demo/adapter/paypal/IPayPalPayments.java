package br.com.designpatterns.demo.adapter.paypal;

import br.com.designpatterns.demo.adapter.utils.Token;

public interface IPayPalPayments {

    Token authToken();
    void paypalPayment();
    void paypalReceive();

}
