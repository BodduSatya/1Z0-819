package com.company.JDBC11.closing;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ResourceLeak {
    public static void main(String[] args) {
        try{
            bad();
        }catch (SQLException sqlException){
            System.out.println( sqlException.getMessage());
            System.out.println( sqlException.getSQLState());
            System.out.println( sqlException.getErrorCode());
        }
    }

    public static void bad() throws SQLException{
        var url = "jdbc:derby:zoo";
        var sql = "SELECT NOT_A_COUMN FROM NAMES";
        var conn = DriverManager.getConnection(url);
        var ps = conn.prepareStatement(sql);
        var rs = ps.executeQuery();
        try(conn;ps;rs){
            while(rs.next()){
                System.out.println("rs = " + rs.getString(1));
            }
        }
    }
}
