package com.pluralsight;
import com.pluralsight.db.DataManager;
import org.apache.commons.dbcp2.BasicDataSource;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("User and Password are needed!");
            System.exit(1);
        }

        String username = args[0];
        String password = args[1];

        BasicDataSource sakilaDataSource = new BasicDataSource();
        sakilaDataSource.setUrl("jdbc:mysql://localhost:3306/sakila");
        sakilaDataSource.setUsername(username);
        sakilaDataSource.setPassword(password);

        DataManager dataManager = new DataManager(sakilaDataSource);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Insert Direct");
            System.out.println("2. Insert With Generated Keys");
            System.out.println("3. Update Record");
            System.out.println("4. Delete Record");
            System.out.println("5. Exit");
            System.out.println("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter a company name to insert: ");
                    System.out.println("Enter a company phone number to insert: ");
                    String name = scanner.nextLine();
                    String phone = scanner.nextLine();

                    String nameWithKey = scanner.nextLine();
                    String phoneWithKey = scanner.nextLine();
                    dataManager.insertIntoWithGeneratedKeys(nameWithKey,phoneWithKey);

                    dataManager.insertIntoDirect(name, phone);
                }
                case 2 -> {


                }
                case 3 -> {
                    System.out.println("Enter a new description: ");
                    String newDescription = scanner.nextLine();

                    System.out.println("Enter the ID of the film you want to update: ");
                    int filmId = scanner.nextInt();
                    scanner.nextLine();
                    dataManager.updateRecord(newDescription, filmId);
                }
                case 4 -> {
                    System.out.println("Enter the country name to delete: ");
                    String countryToDelete = scanner.nextLine();
                    dataManager.deleteRecord(countryToDelete);
                }
                case 5 -> {
                    System.out.println("Exiting...");
                    System.exit(0);
                }
                default -> System.out.println("Invalid Choice. Please try again.");
            }
        }
    }
}