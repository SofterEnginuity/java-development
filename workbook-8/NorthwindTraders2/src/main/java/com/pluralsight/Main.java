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
             SELECT ProductID, ProductName, UnitPrice, UnitsInStock  FROM northwind.products""";
        ResultSet results = statement.executeQuery(query);
        while (results.next()){

            String productName = results.getString("ProductName");
            int productID = results.getInt("ProductID");
            double unitPrice = results.getDouble("UnitPrice");
            int unitsInStock = results.getInt("UnitsInStock");

            System.out.println("ProductID: " + productID);
            System.out.println("ProductName: " + productName);
            System.out.println("Price: " + unitPrice);
            System.out.println("In Stock: " + unitsInStock);
            System.out.println("-----------------------------------------------------------");

        }



        connection.close();
    }
}