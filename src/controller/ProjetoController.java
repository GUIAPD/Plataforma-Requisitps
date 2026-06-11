package controller;

import java.util.List;
import model.Projeto;
import service.ProjetoService;

public class ProjetoController {

    private ProjetoService service =
            new ProjetoService();

    public void cadastrar(
            Projeto projeto){

        service.cadastrarProjeto(
                projeto);
    }

    public List<Projeto> listar(){

        return service.listarProjetos();
    }

    public Projeto buscar(
            int id){

        return service.buscarProjeto(id);
    }

    public void atualizar(
            Projeto projeto){

        service.atualizarProjeto(projeto);
    }

    public void excluir(
            int id){

        service.excluirProjeto(id);
    }
}