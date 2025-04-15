import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = myScanner.nextLine();

        System.out.println("Please enter your age.");
        int age = myScanner.nextInt();

        System.out.println("Please enter a number to indicate the sandwich size you would like.");
        System.out.println("1 - Regular $5.45");
        System.out.println("2 - Large $8.95");
        int choice = myScanner.nextInt();
        double price;
//        Need to assign the choice as a price in order to calculate it!
        if (choice == 1){
            price = 5.45;
        }else if (choice == 2){
            price = 8.95;
        }else{
            System.out.println("Please enter a valid selection.");
            return;
        }
        double finalPrice = 0;


        if (age <= 17) {
               finalPrice = price - (price * .10);
            System.out.println( name + ", You got the student discount!");
        } else if (age >= 65) {
              finalPrice = price - (price * .20);
            System.out.println(name + ", You got the senior discount!");
        }

        System.out.printf(" Your sandwich price is $%.2f", finalPrice);

    }

}
