package service;

import dao.ProjetoDAO;
import java.util.List;
import model.Projeto;

public class ProjetoService {

    private ProjetoDAO dao =
            new ProjetoDAO();

    public void cadastrarProjeto(
            Projeto projeto){

        dao.salvar(projeto);
    }

    public List<Projeto> listarProjetos(){

        return dao.listar();
    }

    public Projeto buscarProjeto(
            int id){

        return dao.buscarPorId(id);
    }

    public void atualizarProjeto(
            Projeto projeto){

        dao.atualizar(projeto);
    }

    public void excluirProjeto(
            int id){

        dao.excluir(id);
    }
}