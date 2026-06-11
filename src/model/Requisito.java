package model;

public class Requisito {

    private int id;
    private String descricao;
    private String status;

    public Requisito() {
    }

    public Requisito(int id, String descricao) {

        this.id = id;
        this.descricao = descricao;
        this.status = "PENDENTE";
    }

    public Requisito(
            int id,
            String descricao,
            String status) {

        this.id = id;
        this.descricao = descricao;
        this.status = status;
    }

    public void aprovar() {

        this.status = "APROVADO";
    }

    public void revisar() {

        this.status = "EM REVISAO";
    }

    public void rejeitar() {

        this.status = "REJEITADO";
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getDescricao() {

        return descricao;
    }

    public void setDescricao(String descricao) {

        this.descricao = descricao;
    }

    public String getStatus() {

        return status;
    }

    public void setStatus(String status) {

        this.status = status;
    }

    @Override
    public String toString() {

        return """
           
           ╔══════════════════════════════════════╗
           ║             REQUISITO               ║
           ╠══════════════════════════════════════╣
           ║ ID.........: %d
           ║ Descrição..: %s
           ║ Status.....: %s
           ╚══════════════════════════════════════╝
           """.formatted(
                   id,
                   descricao,
                   status
           );
    }
}