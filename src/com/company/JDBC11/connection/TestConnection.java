package com.company.JDBC11.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {
    public static void main(String[] args)throws Exception {
        //Class.forName("org.apache.derby.impl.jdbc.EmbedConnection"); // for newer version of jdbc this line is optional.
        Connection conn = DriverManager.getConnection("jdbc:derby:zoo");//jdbc:derby:/localhost:1527/zoo
        System.out.println(conn);
        //org.apache.derby.impl.jdbc.EmbedConnection@1066615508 (XID = 508), (SESSIONID = 1), (DATABASE = zoo), (DRDAID = null)
    }
}
