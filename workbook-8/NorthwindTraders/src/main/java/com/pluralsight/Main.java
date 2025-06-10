package com.pluralsight;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

Class.forName("com.mysql.cj.jdbc.Driver");

Connection connection;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "root", "P@ssw0rd");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

Statement statement = connection.createStatement();

        String query = """
                SELECT * FROM northwind.products""";
        ResultSet results = statement.executeQuery(query);

        while (results.next()) {
            String product = results.getString("ProductName");
            System.out.println(product);
        }


        connection.close();
    }
}