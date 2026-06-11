package model;

import java.time.LocalDateTime;

public class HistoricoAlteracao {

    private int id;
    private String descricao;
    private LocalDateTime dataAlteracao;

    public HistoricoAlteracao() {
    }

    public HistoricoAlteracao(
            int id,
            String descricao,
            LocalDateTime dataAlteracao) {

        this.id = id;
        this.descricao = descricao;
        this.dataAlteracao = dataAlteracao;
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

    public LocalDateTime getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(LocalDateTime dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }

    @Override
    public String toString() {
        return """
           
           ╔══════════════════════════════════════╗
           ║        HISTÓRICO DE ALTERAÇÃO       ║
           ╠══════════════════════════════════════╣
           ║ ID.........: %d
           ║ Descrição..: %s
           ║ Data.......: %s
           ╚══════════════════════════════════════╝
           """.formatted(
                   id,
                   descricao,
                   dataAlteracao
           );
    }
}