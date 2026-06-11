package model;

public class Comentario {

    private int id;
    private String texto;

    public Comentario() {
    }

    public Comentario(
            int id,
            String texto) {

        this.id = id;
        this.texto = texto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        
        return """
           
           ╔══════════════════════════════════════╗
           ║            COMENTÁRIO               ║
           ╠══════════════════════════════════════╣
           ║ ID.........: %d
           ║ Texto......: %s
           ╚══════════════════════════════════════╝
           """.formatted(
                   id,
                   texto
           );
    }
}