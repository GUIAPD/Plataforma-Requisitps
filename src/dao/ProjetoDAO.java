package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Projeto;

public class ProjetoDAO {

    public void salvar(Projeto projeto){

        String sql =
                "INSERT INTO projetos(nome,descricao) VALUES (?,?)";

        try(

            Connection conn =
                    Conexao.conectar();

            PreparedStatement stmt =
                    conn.prepareStatement(sql)

        ){

            stmt.setString(
                    1,
                    projeto.getNome());

            stmt.setString(
                    2,
                    projeto.getDescricao());

            stmt.executeUpdate();

            System.out.println(
                    "Projeto salvo!"
            );

        }catch(Exception e){

            System.out.println(
                    e.getMessage()
            );
        }
    }

    public List<Projeto> listar(){

        List<Projeto> projetos =
                new ArrayList<>();

        String sql =
                "SELECT * FROM projetos";

        try(

            Connection conn =
                    Conexao.conectar();

            PreparedStatement stmt =
                    conn.prepareStatement(sql);

            ResultSet rs =
                    stmt.executeQuery()

        ){

            while(rs.next()){

                Projeto projeto =
                        new Projeto();

                projeto.setId(
                        rs.getInt("id"));

                projeto.setNome(
                        rs.getString("nome"));

                projeto.setDescricao(
                        rs.getString("descricao"));

                projetos.add(
                        projeto);
            }

        }catch(Exception e){

            System.out.println(
                    e.getMessage()
            );
        }

        return projetos;
    }

    public Projeto buscarPorId(
            int id){

        String sql =
                "SELECT * FROM projetos WHERE id=?";

        try(

            Connection conn =
                    Conexao.conectar();

            PreparedStatement stmt =
                    conn.prepareStatement(sql)

        ){

            stmt.setInt(
                    1,
                    id);

            ResultSet rs =
                    stmt.executeQuery();

            if(rs.next()){

                Projeto projeto =
                        new Projeto();

                projeto.setId(
                        rs.getInt("id"));

                projeto.setNome(
                        rs.getString("nome"));

                projeto.setDescricao(
                        rs.getString("descricao"));

                return projeto;
            }

        }catch(Exception e){

            System.out.println(
                    e.getMessage()
            );
        }

        return null;
    }

    public void atualizar(
            Projeto projeto){

        String sql =
                "UPDATE projetos SET nome=?, descricao=? WHERE id=?";

        try(

            Connection conn =
                    Conexao.conectar();

            PreparedStatement stmt =
                    conn.prepareStatement(sql)

        ){

            stmt.setString(
                    1,
                    projeto.getNome());

            stmt.setString(
                    2,
                    projeto.getDescricao());

            stmt.setInt(
                    3,
                    projeto.getId());

            stmt.executeUpdate();

            System.out.println(
                    "Projeto atualizado!"
            );

        }catch(Exception e){

            System.out.println(
                    e.getMessage()
            );
        }
    }

    public void excluir(
            int id){

        String sql =
                "DELETE FROM projetos WHERE id=?";

        try(

            Connection conn =
                    Conexao.conectar();

            PreparedStatement stmt =
                    conn.prepareStatement(sql)

        ){

            stmt.setInt(
                    1,
                    id);

            stmt.executeUpdate();

            System.out.println(
                    "Projeto removido!"
            );

        }catch(Exception e){

            System.out.println(
                    e.getMessage()
            );
        }
    }
}