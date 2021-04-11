package com.company.JDBC11.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class WrongSQL {
    public static void main(String[] args) throws SQLException {
        var sql = "SELECT *FROM NAMES";
        try(Connection con = DriverManager.getConnection("jdbc:derby:zoo")){
            PreparedStatement ps = con.prepareStatement(sql);
            var result = ps.executeUpdate();
            //Statement.executeUpdate() cannot be called with a statement that returns a ResultSet.
        }

        /*sql = "UPDATE EXHIBITS SET NAME='' WHERE NAME='None'";
        try(Connection con = DriverManager.getConnection("jdbc:derby:zoo")){
            PreparedStatement ps = con.prepareStatement(sql);
            var result = ps.executeQuery();
            //Statement.executeQuery() cannot be called with a statement that returns a row count.
        }*/
    }
}
