package com.company.JDBC11.preparedStatement;
import java.sql.*;

public class ExecuteUpdate {
    public static void main(String[] args) throws SQLException{
        try(Connection conn = DriverManager.getConnection("jdbc:derby:zoo");) {
            var insertSql = "INSERT INTO EXHIBITS VALUES(10,'Deer',3)";
            var updateSql = "UPDATE EXHIBITS SET NAME='' WHERE NAME='None'";
            var deleteSql = "DELETE FROM EXHIBITS WHERE ID = 10";

            try (var ps = conn.prepareStatement(insertSql)) {
                int result = ps.executeUpdate();
                System.out.println(result);
            }

            try (var ps = conn.prepareStatement(updateSql)) {
                int result = ps.executeUpdate();
                System.out.println(result);
            }

            try (var ps = conn.prepareStatement(deleteSql)) {
                int result = ps.executeUpdate();
                System.out.println(result);
            }
        }
    }
}
