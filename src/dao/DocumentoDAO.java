package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Documento;

public class DocumentoDAO {

    public void salvar(Documento documento){

        String sql =
                "INSERT INTO documentos(titulo,conteudo) VALUES (?,?)";

        try(

            Connection conn =
                    Conexao.conectar();

            PreparedStatement stmt =
                    conn.prepareStatement(sql)

        ){

            stmt.setString(
                    1,
                    documento.getTitulo());

            stmt.setString(
                    2,
                    documento.getConteudo());

            stmt.executeUpdate();

            System.out.println(
                    "Documento salvo!"
            );

        }catch(Exception e){

            System.out.println(
                    e.getMessage()
            );
        }
    }

    public List<Documento> listar(){

        List<Documento> documentos =
                new ArrayList<>();

        String sql =
                "SELECT * FROM documentos";

        try(

            Connection conn =
                    Conexao.conectar();

            PreparedStatement stmt =
                    conn.prepareStatement(sql);

            ResultSet rs =
                    stmt.executeQuery()

        ){

            while(rs.next()){

                Documento documento =
                        new Documento();

                documento.setId(
                        rs.getInt("id"));

                documento.setTitulo(
                        rs.getString("titulo"));

                documento.setConteudo(
                        rs.getString("conteudo"));

                documentos.add(
                        documento);
            }

        }catch(Exception e){

            System.out.println(
                    e.getMessage()
            );
        }

        return documentos;
    }

    public void atualizar(
            Documento documento){

        String sql =
                "UPDATE documentos SET titulo=?, conteudo=? WHERE id=?";

        try(

            Connection conn =
                    Conexao.conectar();

            PreparedStatement stmt =
                    conn.prepareStatement(sql)

        ){

            stmt.setString(
                    1,
                    documento.getTitulo());

            stmt.setString(
                    2,
                    documento.getConteudo());

            stmt.setInt(
                    3,
                    documento.getId());

            stmt.executeUpdate();

        }catch(Exception e){

            System.out.println(
                    e.getMessage()
            );
        }
    }

    public void excluir(
            int id){

        String sql =
                "DELETE FROM documentos WHERE id=?";

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

        }catch(Exception e){

            System.out.println(
                    e.getMessage()
            );
        }
    }
}