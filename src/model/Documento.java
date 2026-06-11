package model;

public class Documento {

    private int id;
    private String titulo;
    private String conteudo;

    public Documento() {
    }

    public Documento(
            String titulo,
            String conteudo){

        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    public Documento(
            int id,
            String titulo,
            String conteudo){

        this.id = id;
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        
        return """
           
           ╔══════════════════════════════════════╗
           ║             DOCUMENTO               ║
           ╠══════════════════════════════════════╣
           ║ ID.........: %d
           ║ Título.....: %s
           ║ Conteúdo...: %s
           ╚══════════════════════════════════════╝
           """.formatted(
                   id,
                   titulo,
                   conteudo
           );
    }
}