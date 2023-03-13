package br.com.designpatterns.demo.bridge.transmissions;

import br.com.designpatterns.demo.bridge.platforms.IPlatform;

public class AdvancedLive extends Live{

    public AdvancedLive(IPlatform platform) {
        super.platform = platform;
    }

    public void subtitles(){
        System.out.println("legendas ativadas na transmissao");
    }

    public void comments(){
        System.out.println("comentarios liberados na live");
    }

}
