package br.com.designpatterns.demo.bridge.platforms;

public class YouTube implements IPlatform{

    public YouTube() {
        configureRMTP();
        System.out.println("YouTube transmissao iniciada");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("YouTube conta autorizada");
    }

    @Override
    public void authToken() {
        System.out.println("autorizando YouTube");
    }
}
