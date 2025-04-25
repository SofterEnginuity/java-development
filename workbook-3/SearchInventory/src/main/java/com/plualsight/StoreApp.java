package com.plualsight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class StoreApp {
    public static void main(String[] args) {
        List<Product> inventory = getInventory();
//        System.out.println("This is what we have on hand");
        for (Product product : inventory) {
            System.out.println(product);
        }
    }

    public static List<Product> getInventory() {
        List<Product> inventory = new ArrayList<>();

//        inventory.add(new Product(1,"shirt",19.99));
//        inventory.add(new Product1,"hammer",25.99(2,"shoes",29.99));
//        inventory.add(new Product(3,"pants",49.99));
//        inventory.add(new Product(4,"hat",14.99));
//        inventory.add(new Product(5,"jacket",79.99));
        try {
            BufferedReader bufReader = new BufferedReader(new FileReader("inventory.csv"));
            String line;

        while ((line = bufReader.readLine()) != null) {
                String[] parts = line.split("\\|");
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                double price = Double.parseDouble(parts[2]);
                inventory.add(new Product(id, name, price));
        }

//            FileWriter writer = new FileWriter("inventory.csv");
//            BufferedWriter bufWriter =  new BufferedWriter(fileWriter);
//            writer.write("inventory.csv");
        }catch(Exception e){
            System.out.println("something went wrong");
        }
        return inventory;
   }
   public static void ListAllProducts(List<Product> productsList) {
       System.out.println("We carry the following: ");
       for (Product product : productsList) {
           System.out.println(product);
       }
   }





}
