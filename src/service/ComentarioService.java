package service;

import dao.ComentarioDAO;
import java.util.List;
import model.Comentario;

public class ComentarioService {

    private ComentarioDAO dao =
            new ComentarioDAO();

    public void cadastrar(
            Comentario comentario) {

        dao.salvar(comentario);
    }

    public List<Comentario> listar() {

        return dao.listar();
    }

    public void atualizar(
            Comentario comentario) {

        dao.atualizar(comentario);
    }

    public void excluir(
            int id) {

        dao.excluir(id);
    }
}