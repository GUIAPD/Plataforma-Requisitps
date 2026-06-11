package model;

public class Cliente extends Usuario {

    public Cliente(int id,
                   String nome,
                   String email,
                   String login,
                   String senha) {

        super(id,nome,email,login,senha);
    }
}