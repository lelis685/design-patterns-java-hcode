package br.com.designpatterns.demo.chainofresponsibility.middlewares;

public class CheckPermissionMiddleware extends Middleware{

    @Override
    public boolean check(String email, String password) {
        if(email.equals("master@mail.com")){
            System.out.println("bem vindo admin");
            return true;
        }
        System.out.println("bem vindo");
        return checkNext(email, password);
    }


}
