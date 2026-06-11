package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.HistoricoAlteracao;

public class HistoricoDAO {

    public void salvar(
            HistoricoAlteracao historico) {

        String sql =
                "INSERT INTO historico_alteracoes(descricao,data_alteracao) VALUES (?,?)";

        try (

                Connection conn =
                        Conexao.conectar();

                PreparedStatement stmt =
                        conn.prepareStatement(sql)

        ) {

            stmt.setString(
                    1,
                    historico.getDescricao());

            stmt.setTimestamp(
                    2,
                    Timestamp.valueOf(
                            historico.getDataAlteracao()));

            stmt.executeUpdate();

        } catch (Exception e) {

            System.out.println(
                    e.getMessage());
        }
    }

    public List<HistoricoAlteracao> listar() {

        List<HistoricoAlteracao> lista =
                new ArrayList<>();

        String sql =
                "SELECT * FROM historico_alteracoes";

        try (

                Connection conn =
                        Conexao.conectar();

                PreparedStatement stmt =
                        conn.prepareStatement(sql);

                ResultSet rs =
                        stmt.executeQuery()

        ) {

            while (rs.next()) {

                HistoricoAlteracao historico =
                        new HistoricoAlteracao();

                historico.setId(
                        rs.getInt("id"));

                historico.setDescricao(
                        rs.getString("descricao"));

                historico.setDataAlteracao(
                        rs.getTimestamp("data_alteracao")
                                .toLocalDateTime());

                lista.add(historico);
            }

        } catch (Exception e) {

            System.out.println(
                    e.getMessage());
        }

        return lista;
    }
}