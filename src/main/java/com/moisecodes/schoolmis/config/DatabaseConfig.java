package com.moisecodes.schoolmis.config;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;



public class DatabaseConfig {
    private static final String  URL = "jdbc:postgresql://localhost:5432/eduflow";
    private static final String  USER = "postgres";
    private static final String PASSWORD =  System.getenv("EDUFLOW_DB_PASSWORD");

    public static Connection getConnection() throws SQLException {
         if(PASSWORD == null ||  PASSWORD.isBlank()) {
             throw new IllegalStateException(
                     "EDUFLOW_DB_PASSWORD environment variable is not configured."
             );
         }
         return DriverManager.getConnection(URL,USER,PASSWORD);

    }

}
