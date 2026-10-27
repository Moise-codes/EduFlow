package com.moisecodes.schoolmis.config;
import java.sql.SQLException;
import java.sql.Connection;

public class DatabaseConnectionTest {
    public static void main(String[] args) {
        try(Connection connection = DatabaseConfig.getConnection()) {

            if (connection.isValid(2)) {
                System.out.println("Successfully connected to EduFlow!");
                System.out.println("Database : " + connection.getCatalog());

            } else {
                System.out.println("Connection is not valid.");
            }

        }    catch(SQLException e) {
        System.err.println("Database Connection failed.");
        System.err.println("Reason: " + e.getMessage());

    }}



}
