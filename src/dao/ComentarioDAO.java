package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Comentario;

public class ComentarioDAO {

    public void salvar(
            Comentario comentario) {

        String sql =
                "INSERT INTO comentarios(texto) VALUES (?)";

        try (

                Connection conn =
                        Conexao.conectar();

                PreparedStatement stmt =
                        conn.prepareStatement(sql)

        ) {

            stmt.setString(
                    1,
                    comentario.getTexto());

            stmt.executeUpdate();

            System.out.println(
                    "Comentário salvo!"
            );

        } catch (Exception e) {

            System.out.println(
                    e.getMessage());
        }
    }

    public List<Comentario> listar() {

        List<Comentario> comentarios =
                new ArrayList<>();

        String sql =
                "SELECT * FROM comentarios";

        try (

                Connection conn =
                        Conexao.conectar();

                PreparedStatement stmt =
                        conn.prepareStatement(sql);

                ResultSet rs =
                        stmt.executeQuery()

        ) {

            while (rs.next()) {

                Comentario comentario =
                        new Comentario();

                comentario.setId(
                        rs.getInt("id"));

                comentario.setTexto(
                        rs.getString("texto"));

                comentarios.add(
                        comentario);
            }

        } catch (Exception e) {

            System.out.println(
                    e.getMessage());
        }

        return comentarios;
    }

    public void atualizar(
            Comentario comentario) {

        String sql =
                "UPDATE comentarios SET texto=? WHERE id=?";

        try (

                Connection conn =
                        Conexao.conectar();

                PreparedStatement stmt =
                        conn.prepareStatement(sql)

        ) {

            stmt.setString(
                    1,
                    comentario.getTexto());

            stmt.setInt(
                    2,
                    comentario.getId());

            stmt.executeUpdate();

        } catch (Exception e) {

            System.out.println(
                    e.getMessage());
        }
    }

    public void excluir(
            int id) {

        String sql =
                "DELETE FROM comentarios WHERE id=?";

        try (

                Connection conn =
                        Conexao.conectar();

                PreparedStatement stmt =
                        conn.prepareStatement(sql)

        ) {

            stmt.setInt(
                    1,
                    id);

            stmt.executeUpdate();

        } catch (Exception e) {

            System.out.println(
                    e.getMessage());
        }
    }
}