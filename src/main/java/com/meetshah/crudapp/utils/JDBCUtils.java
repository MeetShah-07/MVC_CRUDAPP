package com.meetshah.crudapp.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtils {
     private static final String URL = "jdbc:postgresql://localhost:5432/cruddb";
    private static final String USER = "postgres";
    private static final String PASSWORD = "password";

    static {
        try {
            Class.forName("org.postgresql.Driver");

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static Connection fetchConnection() throws SQLException {
        return DriverManager.getConnection(URL,USER,PASSWORD);
    }
}
