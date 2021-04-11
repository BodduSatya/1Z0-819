package com.company.JDBC11.closing;

import java.sql.DriverManager;

public class TryCatchResources {
    public static void main(String[] args) throws Exception{
        var url = "jdbc:derby:zoo";
        var sql = "SELECT COUNT(*) FROM NAMES WHERE ID = ?";
        try(var con = DriverManager.getConnection(url);
            var ps = con.prepareStatement(sql)){
            ps.setInt(1,1);

            var rs1 = ps.executeQuery();
            while(rs1.next()){
                System.out.println("rs1.getInt(1) = " + rs1.getInt(1));
            }

            ps.setInt(1,2);
            var rs2 = ps.executeQuery();
            while(rs2.next()){
                System.out.println("rs2 = " + rs2.getInt(1));
            }
            rs2.close();

        }
    }
}
