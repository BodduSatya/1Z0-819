package com.company.JDBC11.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Parameter {
    public static void main(String[] args) throws SQLException {
        try(Connection con = DriverManager.getConnection("jdbc:derby:zoo")){
            register(con);
            register(con,7,1,"satya");
//            registerMore(con,8,1,"chowdary");
//            registerLess(con,9,1,"Narayana");
        }
    }
    public static void register(Connection conn) throws SQLException{
        var sql = "INSERT INTO NAMES VALUES (6,1,'Edith')";
        try(var ps = conn.prepareStatement(sql)){
            int result = ps.executeUpdate();
            System.out.println(result);
        }
    }

    public static void register(Connection conn,int key,int type,String name) throws SQLException{
        var sql = "INSERT INTO NAMES VALUES (?,?,?)";
        try(var ps = conn.prepareStatement(sql)){

            ps.setInt(1,key);
            ps.setInt(2,type);
            ps.setString(3,name);

            /*ps.setObject(1,key);
            ps.setObject(2,type);
            ps.setObject(3,name);*/

            int result = ps.executeUpdate();
            System.out.println(result);
        }
    }

    public static void registerMore(Connection conn,int key,int type,String name) throws SQLException{
        var sql = "INSERT INTO NAMES VALUES (?,?)";
        try(var ps = conn.prepareStatement(sql)){

            ps.setInt(1,key);
            ps.setString(3,name);
            ps.setInt(2,type);

            int result = ps.executeUpdate();
            System.out.println(result);
        }
    }
    public static void registerLess(Connection conn,int key,int type,String name) throws SQLException{
        var sql = "INSERT INTO NAMES VALUES (?,?,?)";
        try(var ps = conn.prepareStatement(sql)){

            ps.setInt(1,key);
            ps.setInt(2,type);

            int result = ps.executeUpdate();
            System.out.println(result);
        }
    }
}
