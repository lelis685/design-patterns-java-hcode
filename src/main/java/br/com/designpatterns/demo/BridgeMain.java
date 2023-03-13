package br.com.designpatterns.demo;

import br.com.designpatterns.demo.bridge.platforms.Facebook;
import br.com.designpatterns.demo.bridge.platforms.IPlatform;
import br.com.designpatterns.demo.bridge.platforms.TwitchTV;
import br.com.designpatterns.demo.bridge.platforms.YouTube;
import br.com.designpatterns.demo.bridge.transmissions.AdvancedLive;
import br.com.designpatterns.demo.bridge.transmissions.Live;

public class BridgeMain {

    public static void main(String[] args) {
        startLive(new YouTube());
        startLive(new Facebook());
        startAdvancedLive(new TwitchTV());
    }


    public static void startLive(IPlatform platform){
        System.out.println("iniciando transmissao, aguarde...");
        Live live = new Live(platform);
        live.broadcasting();
        live.result();
    }



    public static void startAdvancedLive(IPlatform platform){
        System.out.println("iniciando transmissao avancada, aguarde...");
        AdvancedLive live = new AdvancedLive(platform);
        live.broadcasting();
        live.result();
        live.subtitles();
        live.comments();
    }

}
