package controller;

import java.util.List;
import model.Documento;
import service.DocumentoService;

public class DocumentoController {

    private DocumentoService service =
            new DocumentoService();

    public void cadastrar(
            Documento documento){

        service.cadastrar(documento);
    }

    public List<Documento> listar(){

        return service.listar();
    }

    public void atualizar(
            Documento documento){

        service.atualizar(documento);
    }

    public void excluir(
            int id){

        service.excluir(id);
    }
}