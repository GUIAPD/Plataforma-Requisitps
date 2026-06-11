package service;

import dao.DocumentoDAO;
import java.util.List;
import model.Documento;

public class DocumentoService {

    private DocumentoDAO dao =
            new DocumentoDAO();

    public void cadastrar(
            Documento documento){

        dao.salvar(documento);
    }

    public List<Documento> listar(){

        return dao.listar();
    }

    public void atualizar(
            Documento documento){

        dao.atualizar(documento);
    }

    public void excluir(
            int id){

        dao.excluir(id);
    }
}