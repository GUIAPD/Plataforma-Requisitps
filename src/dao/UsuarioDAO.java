package dao;

import java.sql.*;

public class UsuarioDAO {

    public boolean autenticar(
            String login,
            String senha){

        String sql =
            "SELECT * FROM usuarios WHERE login=? AND senha=?";

        try{

            Connection conn =
                    Conexao.conectar();

            PreparedStatement stmt =
                    conn.prepareStatement(sql);

            stmt.setString(1,login);
            stmt.setString(2,senha);

            ResultSet rs =
                    stmt.executeQuery();

            return rs.next();

        }catch(Exception e){

            System.out.println(e.getMessage());

            return false;
        }
    }
}