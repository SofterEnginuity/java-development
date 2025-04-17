import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please provide the following information");

        //not using println because we want it to print on the same line.
        System.out.print("Full name: ");
        String fullName = myScanner.nextLine();
//     \n before billing is putting on a new line like enter or return in Word
        System.out.println("\nBilling Address: ");
        String billingAddress = myScanner.nextLine();


        System.out.print("Billing City: ");
        String billingCity = myScanner.nextLine();

        System.out.print("Billing State: ");
        String billingState = myScanner.nextLine();

        System.out.print("Billing Zipcode: ");
        String billingZipcode = myScanner.nextLine();




        System.out.print("\nShipping Address: ");
        String shippingAddress = myScanner.nextLine();

        System.out.print("Shipping City: ");
        String shippingCity = myScanner.nextLine();

        System.out.print("Shipping State: ");
        String shippingState = myScanner.nextLine();

        System.out.print("Shipping Zipcode: ");
        String shippingZipcode = myScanner.nextLine();



        StringBuilder addressBuilder = new StringBuilder();
        //     \n\n because we are going to the next line and skipping a space
        addressBuilder.append(fullName).append("\n\n");
        addressBuilder.append("Billing Address:").append("\n");
        addressBuilder.append(billingAddress).append("\n");
        addressBuilder.append(billingCity)
                .append(", ")
                .append(billingState)
                .append(" ")
                .append(billingZipcode);
        addressBuilder.append("\n");
//        addressBuilder.append(billingState);
//        addressBuilder.append(billingZipcode);
//        addressBuilder.append("\n");
        addressBuilder.append(fullName).append("\n\n");
        addressBuilder.append("Shipping Address:").append("\n");
        addressBuilder.append(shippingAddress).append("\n");
        addressBuilder.append(shippingCity)
                .append(", ")
                .append(shippingState)
                .append(" ")
                .append(shippingZipcode);
        addressBuilder.append("\n");

//save it to a string so that you can print it and use it
        String addressBuilderString = addressBuilder.toString();
        System.out.println(addressBuilderString);

    }
}
