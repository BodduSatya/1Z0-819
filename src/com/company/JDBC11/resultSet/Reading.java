package com.company.JDBC11.resultSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class Reading {
    public static void main(String[] args) throws SQLException {
        try(Connection conn = DriverManager.getConnection("jdbc:derby:zoo");){
            var sql = "SELECT ID,NAME FROM EXHIBITS";
            Map<Integer,String> idToNameMap = new HashMap<>();
            try(var ps = conn.prepareStatement(sql);
            var rs = ps.executeQuery()){
                while(rs.next()){
                    int id = rs.getInt("id");
                    String name = rs.getString("name");

                    /*int id = rs.getInt(1);
                    String name = rs.getString(2);
                    */

                    idToNameMap.put(id,name);
                }
                System.out.println(idToNameMap);
            }
            sql = "SELECT COUNT(*) AS COUNT FROM EXHIBITS";
            try(var ps = conn.prepareStatement(sql);
                var rs = ps.executeQuery()){
                if(rs.next()){
//                    System.out.println(rs.getInt(1));
                    System.out.println(rs.getInt("COUNT"));
                }
            }
        }

    }
}
