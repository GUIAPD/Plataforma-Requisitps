package service;

import dao.UsuarioDAO;

public class LoginService {

    UsuarioDAO dao =
            new UsuarioDAO();

    public boolean login(
            String usuario,
            String senha){

        return dao.autenticar(
                usuario,
                senha
        );
    }
}