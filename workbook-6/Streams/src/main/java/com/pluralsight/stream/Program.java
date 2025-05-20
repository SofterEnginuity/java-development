package com.pluralsight.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Person> allPeople = new ArrayList<>();

        allPeople.add(new Person("Angel","Morris",30));
        allPeople.add(new Person("Raymond","Maroun",34));
        allPeople.add(new Person("Chris","Hanson",52));
        allPeople.add(new Person("Sebastian","Williams",30));
        allPeople.add(new Person("Jojo","Siwa",22));
        allPeople.add(new Person("Sebrina","Williams",4));
        allPeople.add(new Person("Beyonce","Knowles",35));
        allPeople.add(new Person("Kanye","West",42));
        allPeople.add(new Person("Chris ","Brown",38));
        allPeople.add(new Person("Carl","Galagher",42));
        allPeople.add(new Person("Reba","MacEntire",62));

        System.out.println("Please enter a name to search");
        String userName = scanner.nextLine();


    }

}
