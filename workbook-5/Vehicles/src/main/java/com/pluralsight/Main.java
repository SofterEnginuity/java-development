package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        Car car = new Car();

        car.setMake("Honda");
        car.setModel("Civic");
        car.setYear(2024);
        car.setColor("Grey");
        car.setFuelCapacity(200);
        car.setNumOfPassengers(2);
        car.setPrice(42000);
        car.setSpeed(35);
        car.setCargoCapacity(1);

        car.accelerate();
        car.openTrunk();
        System.out.println("Your current speed is " + car.getSpeed());









    }
}
