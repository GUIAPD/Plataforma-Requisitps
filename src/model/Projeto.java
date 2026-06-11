package model;

public class Projeto {

    private int id;
    private String nome;
    private String descricao;

    public Projeto() {
    }

    public Projeto(
            int id,
            String nome,
            String descricao){

        this.id=id;
        this.nome=nome;
        this.descricao=descricao;
    }

    public String getNome(){
        return nome;
    }

    public String getDescricao(){
        return descricao;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    @Override
    public String toString() {

        return """
           =========================
                 PROJETO
           =========================
           ID: %d
           Nome: %s
           Descrição: %s
           =========================
           """.formatted(
                   id,
                   nome,
                   descricao
           );
    }
}