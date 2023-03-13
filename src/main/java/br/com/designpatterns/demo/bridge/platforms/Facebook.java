package br.com.designpatterns.demo.bridge.platforms;

public class Facebook implements IPlatform{

    public Facebook() {
        configureRMTP();
        System.out.println("Facebook transmissao iniciada");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("facebook conta autorizada");
    }

    @Override
    public void authToken() {
        System.out.println("autorizando facebook");
    }
}
