package com.pluralsight;

public class Main {
    public static void main(String[] args) {

//        Vehicle vehicle = new Vehicle();
//
Car car = new Car();
        Car.setMake("Honda");
        Car.setModel("Civic");
        Car.setYear(2024);
        Car.setColor("Grey");
        Car.setFuelCapacity(200);
        Car.setNumOfPassengers(2);
        Car.setPrice(42000);
        Car.setSpeed(35);
        Car.setCargoCapacity(1);


        Car.accelerate();
        System.out.println(Car.getSpeed());








    }
}
