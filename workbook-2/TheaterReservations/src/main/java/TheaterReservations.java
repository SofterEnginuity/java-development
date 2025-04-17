import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter your name.");
        String name = myScanner.nextLine();

        //this is creating a variable to hold the space, since we are splitting it up
        int indexOfSpace = name.indexOf(" ");

        String firstName = name.substring(0, indexOfSpace);
        String lastName  = name.substring(indexOfSpace +1);

        System.out.println("What day will you be coming? (MM/dd/yyyy)");
        String userInput = myScanner.nextLine();//you have to give the input a variable

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate day = LocalDate.parse(userInput, formatter);


        System.out.println("How many tickets would you like?");
        int tickets = myScanner.nextInt();



        if(tickets == 1){
            System.out.println(" 1 ticket reserved for " + name + " on " +  day);
        }else{
            System.out.println( tickets + " tickets reserved for " + lastName + ", " + firstName + " on " +  day);
        }

    }
}
