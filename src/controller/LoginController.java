package controller;

import service.LoginService;

public class LoginController {

    LoginService service =
            new LoginService();

    public boolean entrar(
            String usuario,
            String senha){

        return service.login(
                usuario,
                senha
        );
    }
}