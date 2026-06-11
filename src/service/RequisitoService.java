package service;

import dao.RequisitoDAO;
import java.util.List;
import model.Requisito;

public class RequisitoService {

    private RequisitoDAO dao =
            new RequisitoDAO();

    public void cadastrar(
            Requisito requisito) {

        dao.salvar(requisito);
    }

    public List<Requisito> listar() {

        return dao.listar();
    }

    public void atualizar(
            Requisito requisito) {

        dao.atualizar(requisito);
    }

    public void excluir(
            int id) {

        dao.excluir(id);
    }
}