package service;

import dao.HistoricoDAO;
import java.util.List;
import model.HistoricoAlteracao;

public class HistoricoService {

    private HistoricoDAO dao =
            new HistoricoDAO();

    public void registrar(
            HistoricoAlteracao historico) {

        dao.salvar(historico);
    }

    public List<HistoricoAlteracao> listar() {

        return dao.listar();
    }
}