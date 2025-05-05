package com.pluralsight;

public class Main {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter your desired number of beds.");
//        int beds = scanner.nextInt();

Room room1 = new Room(2,129.99,false);
        System.out.println(room1.getPrice());

    }
Reservation reservation1 = new Reservation("king", 169.99,3,true);


}
