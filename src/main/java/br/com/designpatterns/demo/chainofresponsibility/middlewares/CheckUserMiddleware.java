package br.com.designpatterns.demo.chainofresponsibility.middlewares;

import br.com.designpatterns.demo.chainofresponsibility.server.Server;

public class CheckUserMiddleware extends Middleware {

    private Server server;

    public CheckUserMiddleware(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
        if (!server.hasEmail(email)) {
            System.out.println("email invalido");
            return false;
        }
        if (!server.isValidPassword(email, password)) {
            System.out.println("email ou senha invalidos");
            return false;
        }
        return checkNext(email, password);
    }
}
