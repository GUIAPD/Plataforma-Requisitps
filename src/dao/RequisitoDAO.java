package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Requisito;

public class RequisitoDAO {

    public void salvar(Requisito requisito) {

        String sql =
                "INSERT INTO requisitos(descricao,status) VALUES (?,?)";

        try (
                Connection conn = Conexao.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql)
        ) {

            stmt.setString(
                    1,
                    requisito.getDescricao());

            stmt.setString(
                    2,
                    requisito.getStatus());

            stmt.executeUpdate();

            System.out.println(
                    "Requisito salvo!"
            );

        } catch (Exception e) {

            System.out.println(
                    e.getMessage()
            );
        }
    }

    public List<Requisito> listar() {

        List<Requisito> lista =
                new ArrayList<>();

        String sql =
                "SELECT * FROM requisitos";

        try (
                Connection conn = Conexao.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()
        ) {

            while (rs.next()) {

                Requisito requisito =
                        new Requisito();

                requisito.setId(
                        rs.getInt("id"));

                requisito.setDescricao(
                        rs.getString("descricao"));

                requisito.setStatus(
                        rs.getString("status"));

                lista.add(requisito);
            }

        } catch (Exception e) {

            System.out.println(
                    e.getMessage()
            );
        }

        return lista;
    }

    public void atualizar(Requisito requisito) {

        String sql =
                "UPDATE requisitos SET descricao=?, status=? WHERE id=?";

        try (
                Connection conn = Conexao.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql)
        ) {

            stmt.setString(
                    1,
                    requisito.getDescricao());

            stmt.setString(
                    2,
                    requisito.getStatus());

            stmt.setInt(
                    3,
                    requisito.getId());

            stmt.executeUpdate();

            System.out.println(
                    "Requisito atualizado!"
            );

        } catch (Exception e) {

            System.out.println(
                    e.getMessage()
            );
        }
    }

    public void excluir(int id) {

        String sql =
                "DELETE FROM requisitos WHERE id=?";

        try (
                Connection conn = Conexao.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql)
        ) {

            stmt.setInt(
                    1,
                    id);

            stmt.executeUpdate();

            System.out.println(
                    "Requisito removido!"
            );

        } catch (Exception e) {

            System.out.println(
                    e.getMessage()
            );
        }
    }
}