import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
 Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = myScanner.nextLine();

        System.out.println("Enter the hours worked.");
        float hours = myScanner.nextFloat();

        System.out.println("Please enter your hourly rate.");
        float pay = myScanner.nextFloat();


        float gross = hours * pay;
        System.out.println("The employee is " + name + " and they made $" + gross);

//        System.out.println(" The employee is " + name + "and they make " + gross);
    }
}
