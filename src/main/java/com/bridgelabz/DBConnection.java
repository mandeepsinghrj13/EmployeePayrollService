package com.bridgelabz;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;


public class DBConnection {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/payroll_service?userSSL=false";
        String username = "root";
        String password = "Dera@1234";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        listDrivers();
        Connection connection = null;
        try {
            System.out.println("Connection to database: " + jdbcUrl);
            connection = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("Connection to the Database Successful: " + connection);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    private static void listDrivers() {
        Enumeration<Driver> drivers = DriverManager.getDrivers();
        while (drivers.hasMoreElements())
            System.out.println(drivers.nextElement());
    }
    }


