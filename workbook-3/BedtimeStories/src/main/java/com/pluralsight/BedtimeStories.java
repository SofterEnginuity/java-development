package com.pluralsight;

import java.io.FileInputStream;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("goldilocks.txt");
            Scanner myScanner = new Scanner(fis);
int number = 1;

            String line;

            while (myScanner.hasNextLine()) {
                line = myScanner.nextLine();
                System.out.println(line);

            }
            myScanner.close();
//        System.out.println();
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}
