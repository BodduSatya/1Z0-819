package com.company.JDBC11.resultSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class BadCode {
    public static void main(String[] args) throws SQLException {
        try(Connection conn = DriverManager.getConnection("jdbc:derby:zoo");){

            var sql = "SELECT COUNT(*) AS COUNT FROM EXHIBITS";
            /*try(var ps = conn.prepareStatement(sql);
                var rs = ps.executeQuery()){
                if(rs.next()){
//                    System.out.println(rs.getInt(1));
                    System.out.println(rs.getInt("total"));
                    //Column 'total' not found.
                }
            }*/

            /*sql = "SELECT *FROM EXHIBITS where name ='Not in table'";
            try(var ps = conn.prepareStatement(sql);
                var rs = ps.executeQuery()){
                rs.next();
                System.out.println(rs.getInt(1));//Invalid cursor state - no current row.
            }*/

            sql = "SELECT *FROM EXHIBITS where name ='Not in table'";
            try(var ps = conn.prepareStatement(sql);
                var rs = ps.executeQuery()){
                rs.next();
                System.out.println(rs.getInt(0));//Column '0' not found.
            }
        }
    }
}
