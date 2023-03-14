package br.com.designpatterns.demo;

import br.com.designpatterns.demo.chainofresponsibility.middlewares.CheckPermissionMiddleware;
import br.com.designpatterns.demo.chainofresponsibility.middlewares.CheckUserMiddleware;
import br.com.designpatterns.demo.chainofresponsibility.middlewares.Middleware;
import br.com.designpatterns.demo.chainofresponsibility.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChainOfResponsibilityMain {

    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    private static Server server;


    public static void init(){
        server = new Server();
        server.registerUser("marco@mail.com", "123");
        server.registerUser("user@mail.com", "123");
        server.registerUser("master@mail.com", "123");

        Middleware middleware = new CheckUserMiddleware(server);
        middleware.linkWith(new CheckPermissionMiddleware());

        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {

        init();

        boolean done;

        do{
            System.out.println("digite email");
            String email = reader.readLine();

            System.out.println("digite senha");
            String pass = reader.readLine();

            done = server.login(email, pass);
        }while (!done);



    }

}
