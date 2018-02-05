/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daos;

import Connection.ConnectionUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author joliveira
 */
public class DaoUser {

    public static boolean verificarUsuario(String login, String senha) throws
            SQLException, Exception {
        String sql = "SELECT * FROM tb_user"
                + " WHERE Username = ?"
                + " AND Password = ?;";
        Connection connection = null;
        PreparedStatement statement = null;

        connection = ConnectionUtils.getConnection();
        statement = connection.prepareStatement(sql);

        statement.setString(1, login);
        statement.setString(2, senha);

        System.out.println("Executando CONSULTA SQL: " + sql);
        ResultSet result = statement.executeQuery();

        while (result.next()) {
            return true;
        }

        return false;
    }
}
