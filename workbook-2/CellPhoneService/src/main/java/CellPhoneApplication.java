import com.pluralsight.CellPhone;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        //create a new phone object
        CellPhone phone1 = new CellPhone();
        //String serialNumber, String model, String carrier, String phoneNumber, String owner
        //gather the information for the specific phone


        System.out.print("What is the serial number");
        int serialNumber = myScanner.nextInt();
        phone1.setSerialNumber(serialNumber);
        myScanner.nextLine();

        System.out.print("What is the model?");
        String model = myScanner.nextLine();
        phone1.setModel(model);

        System.out.print("Who is the carrier?");
        String carrier = myScanner.nextLine();
        phone1.setCarrier(carrier);

        System.out.print("what is the phone number");
        String phoneNumber = myScanner.nextLine();
        phone1.setPhoneNumber(phoneNumber);

        System.out.print("Who is the owner?");
        String owner = myScanner.nextLine();
        phone1.setOwner(owner);


        System.out.println("Serial Number: " + serialNumber );
        System.out.println("Model: " + model);
        System.out.println("Carrier: " + carrier);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Owner: " + owner);

    }
}
