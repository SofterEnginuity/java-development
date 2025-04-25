package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {

        try {

            String fileName = "employees.csv";
            FileReader fileReader = new FileReader("employees.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            FileWriter fileWriter = new FileWriter("employees.txt");
//            BufferedWriter bufWriter = new BufferedWriter(fileWriter);
//            String employeeID =
                    String text = "Employee ID: " + employeeID;
            Scanner myScanner = new Scanner(System.in);

            System.out.println("enter the name of the file employee to process");
            String reqEmployeeID = myScanner.nextLine();

            if(reqEmployeeID.equals(employeeID)){
                System.out.println("yes");
            }




            while((line = bufferedReader.readLine()) !=null) {
                String[] lineParts = line.split("\\|");
                int employeeID = Integer.parseInt(lineParts[0]);
               String name = lineParts[1];
                double hoursWorked = Double.parseDouble(lineParts[0]);
                double payRate = Double.parseDouble(lineParts[3]);
                System.out.println(Arrays.toString(lineParts));

                Employee employee = new Employee(employeeID, name, hoursWorked, payRate);

                System.out.println("Employee ID: %d, Name:%s, GrossPay: .2f%n" ,
                employee.getEmployeeID(),employee.getName(), employee.getGrossPay());
            }

        } catch (Exception e) {
            System.out.println("Error reading the file.");
            System.out.println();

        }

    }
}
