package com.nitish.jdbc;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class JDBC {

  public static void main(String[] argv) {
    System.out.println("Program Start");
    Connection connection = null;
      try {
        Class.forName("com.mysql.jdbc.Driver");
      } catch (ClassNotFoundException e) {
        System.out.println("ERROR NO 1");
        e.printStackTrace();
        return;
      }
      // Driver Manager Register
      try {
        connection = DriverManager
        .getConnection("jdbc:mysql://localhost:3306/db","root", "password");
      } catch (SQLException e) {
        System.out.println("Fail to register Driver Manager");
        e.printStackTrace();
        return;
      }
    // Checking Connection
    if (connection != null) {
      System.out.println("Perform SQL query here !");
    } else {
      System.out.println("Connection Fail");
    }
  }
}
