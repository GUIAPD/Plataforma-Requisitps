package controller;

import java.util.List;
import model.Comentario;
import service.ComentarioService;

public class ComentarioController {

    private ComentarioService service =
            new ComentarioService();

    public void cadastrar(
            Comentario comentario) {

        service.cadastrar(comentario);
    }

    public List<Comentario> listar() {

        return service.listar();
    }

    public void atualizar(
            Comentario comentario) {

        service.atualizar(comentario);
    }

    public void excluir(
            int id) {

        service.excluir(id);
    }
}