package br.com.designpatterns.demo.bridge.transmissions;

import br.com.designpatterns.demo.bridge.platforms.IPlatform;

public class Live implements ITransmission{

    protected IPlatform platform;

    public Live() {
    }

    public Live(IPlatform platform) {
        this.platform = platform;
    }

    @Override
    public void broadcasting() {
        System.out.println("iniciando transmissao");
    }

    @Override
    public void result() {
        System.out.println("** NO AR **");
    }
}
