package model;

public class Usuario extends Pessoa {

    private String login;
    private String senha;

    public Usuario() {
    }

    public Usuario(
            int id,
            String nome,
            String email,
            String login,
            String senha){

        super(id,nome,email);

        this.login = login;
        this.senha = senha;
    }

    public boolean autenticar(
            String login,
            String senha){

        return this.login.equals(login)
                &&
                this.senha.equals(senha);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(
            String login) {

        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(
            String senha) {

        this.senha = senha;
    }
}