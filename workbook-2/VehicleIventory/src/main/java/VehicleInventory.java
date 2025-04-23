package com.pluralsight;

public class VehicleInventory {
    private static Vehicle[] vehicles = new Vehicle[20];

    private static int numOfVehicles = 6;

    public static void main(String[] args) {
        vehicles[0] = new Vehicle(101121, "Ford Explorer", "Red", 45000,13500f);
        vehicles[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000.00f);
        vehicles[2] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700.00f);
        vehicles[3] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500.00f);
        vehicles[4] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500.00f);
        vehicles[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000.00f);

    }
    private static void listAllVehicles(){
        System.out.println("Inventory");
        for (int numOfVehicles = 0; numOfVehicles < ; numOfVehicles++) {
            System.out.println(vehicles[i]);
            found = true;
        }
    }
    private static void findMakeModel(Scanner myScanner){
        System.out.println("enter make and model");
        String akeModel = scanner.nextLine();

        boolen found = false;
    }
        for (int i = 0; i < numOfVehicles; i++){
        if (vehicles[i].getMakeModel().equalsIgnoreCase(makeModel))
            System.out.println(vehicles[i]);
    } if(!found) {
        System.out.println("No vehicles found that match your color selection.");
    }

//
    private static void findVehiclesByPrice(Scanner scanner){
        System.out.println("Enter min price");
        float minPrice = myScanner.nextFloat();
        System.out.println("Enter max price");
        float maxPrice = myScanner.nextFloat();
        boolean found = false;
        for (int i = 0; i < ; i++) {
            if(vehicles[i].getPrice() >= minPrice && vehicles[i].getPrice <= maxPrice){
                System.out.println(vehicles[i]);
                found = true;
            }
        }if (!found) {
            System.out.println("No vehicles found within that range.");
        }



        private static void findVehiclesByColor(Scanner scanner) {
            System.out.println("Enter color: ");
            String color = scanner.nextLine();

            boolean found = false;

            for (int i = 0; i < numOfVehicles; i++) {
                if (vehicles[i].getColor().equalsIgnoreCase(color)) {
                    System.out.println(vehicles[i]);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("No vehicles found that match your color selection.");
            }
        }
}
