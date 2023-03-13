package br.com.designpatterns.demo.adapter.utils;

public class Token {

    private final String token;

    public Token() {
        this.token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiRGVzaWduIFBhdHRlcm5zIiwiaWF0IjoxNTE2MjM5MDIyfQ.p8gqwYgX2vAsP3_DJK1ggHXH6tWgm995g9dIde5uRpY";
    }

    public String getToken() {
        return token;
    }
}
