package com.pluralsight;

import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileReader;

public class PayrollCalculator {
    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("employees.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while((line = bufferedReader.readLine()) !=null) {
                String[] lineParts = line.split("\\|");
                int employeeID = Integer.parseInt(lineParts[0]);
               String name = lineParts[1];
                double hoursWorked = Double.parseDouble(lineParts[0]);
                double payRate = Double.parseDouble(lineParts[3]);
                System.out.println(Arrays.toString(lineParts));

                Employee employee = new Employee(employeeID, name, hoursWorked, payRate);
            }

        } catch (Exception e) {
            System.out.println("Error reading the file.");
            System.out.println();

        }

    }
}
