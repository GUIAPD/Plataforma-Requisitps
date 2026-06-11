package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    private static final String URL =
            "jdbc:mysql://localhost:3306/plataforma_requisitos"; //nome do banco de dados

    private static final String USER =
            "..";  //usuario do banco de daods

    private static final String PASSWORD =
            ".."; // senha do banco de dados

    public static Connection conectar() {

        try {

            return DriverManager.getConnection(
                    URL,
                    USER,
                    PASSWORD
            );

        } catch (Exception e) {

            throw new RuntimeException(e);
        }
    }
}