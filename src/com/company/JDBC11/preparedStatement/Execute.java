package com.company.JDBC11.preparedStatement;

import java.sql.*;

public class Execute {
    public static void main(String[] args) throws SQLException {
        try(Connection con = DriverManager.getConnection("jdbc:derby:zoo")){
            PreparedStatement ps = con.prepareStatement("SELECT *FROM NAMES");
            boolean isResultSet = ps.execute();
            if(isResultSet){
                try(ResultSet rs = ps.getResultSet()){
                    System.out.println("query ran");
                }
            }else{
                int updatedCount = ps.getUpdateCount();
                System.out.println("rows effected "+updatedCount);
            }
        }
    }
}
