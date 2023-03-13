package br.com.designpatterns.demo.bridge.platforms;

public class TwitchTV implements IPlatform{

    public TwitchTV() {
        configureRMTP();
        System.out.println("TwitchTV transmissao iniciada");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("TwitchTV conta autorizada");
    }

    @Override
    public void authToken() {
        System.out.println("autorizando TwitchTV");
    }
}
