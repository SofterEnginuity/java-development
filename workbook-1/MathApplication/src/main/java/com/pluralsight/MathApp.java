package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

//      Question 1:
        float bobSalary = 1000000.00f;
        float garySalary = 750000.00f;
        float highestSalary  = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is " + highestSalary);

//      Question 2:
        double carPrice = 25999.99;
        double truckPrice = 4599.99;
        double lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The lowest car price is " + lowestPrice);

        //Question 3:
        double radius = 7.25f;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area is " + area);

        //Question 4:
         double number = 5.0;
         double newNumber = Math.sqrt(number);
         System.out.println("The square root of " + number + " is " + newNumber);

        //Question 5: this was the instructor's solution
        int x1 = 5, y1 = 10, x2 = 85, y2 = 50;
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The distance between points is " + distance);


        //Question 6: this one was instructor solution
        double num2 = -3.8;
        double absNum2 = Math.abs(num2);
        System.out.println(" The absolute value of " + num2 + "is" + absNum2);


        //Question 7: this one was instructor solution
        double randomNum = Math.random();
        System.out.println("The random number is " + randomNum);
    }
}
