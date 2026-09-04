package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static Connection abrirConexao() {
        Connection con = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
            final String USER = "rm569947";
            final String PASS = "200508";
            con = DriverManager.getConnection(url, USER, PASS);
            System.out.println("Conexão aberta");

        } catch (ClassNotFoundException e) {
            System.out.println("Erro:a class de conexão não encontrada " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Erro de SQL " + e.getMessage());
        }
            return con;
        }
        public static void fecharConexao(Connection con){
            try {
                con.close();
                System.out.println("Conexão fechada");
            }catch (SQLException e) {
                System.out.println("Erro de SQL " + e.getMessage());
            }
        }
    }

