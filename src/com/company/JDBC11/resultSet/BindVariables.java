package com.company.JDBC11.resultSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BindVariables {
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
        var sql = "SELECT ID FROM EXHIBITS WHERE NAME = ?";

        try(var ps = conn.prepareStatement(sql)){
            ps.setString(1,"Zebra");
            try(var rs = ps.executeQuery()){
                while(rs.next()){
                    int id = rs.getInt("id");
                    System.out.println("id = " + id);
                }
            }
        }
    }
}
