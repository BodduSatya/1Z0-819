package com.company.JDBC11.preparedStatement;

import java.sql.*;

public class ExecuteQuery {
    public static void main(String[] args) throws SQLException {
        try(
                Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
                PreparedStatement ps = conn.prepareStatement("SELECT *FROM NAMES ");
                ResultSet rs = ps.executeQuery();
        ){
            while(rs.next()){
                System.out.println(rs.getString(1)+"-"+rs.getString(2)+"-"+rs.getString(3));
            }
        }
    }
}
