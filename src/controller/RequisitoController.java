package controller;

import java.util.List;
import model.Requisito;
import service.RequisitoService;

public class RequisitoController {

    private RequisitoService service =
            new RequisitoService();

    public void cadastrar(
            Requisito requisito) {

        service.cadastrar(requisito);
    }

    public List<Requisito> listar() {

        return service.listar();
    }

    public void atualizar(
            Requisito requisito) {

        service.atualizar(requisito);
    }

    public void excluir(
            int id) {

        service.excluir(id);
    }
}