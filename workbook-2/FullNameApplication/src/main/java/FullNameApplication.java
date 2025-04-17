
import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Please enter your first name.");
        String firstName = myScanner.nextLine();

        System.out.print("Please enter your middle name.");
        String middleName = myScanner.nextLine();

        System.out.print("Please enter your last name.");
        String lastName = myScanner.nextLine();
        System.out.print("Please enter an applicable suffix.");
        String suffix = myScanner.nextLine();



if(middleName.isEmpty()){
    System.out.println(firstName + " " + lastName + " " + suffix);
} else if(suffix.isEmpty()){
    System.out.println(firstName + " " + middleName + " " + lastName);
}
else{
    System.out.println(firstName + " " + middleName + " " + lastName + " " + suffix);

}
//        System.out.println(fullName);
//
//}
//        do{
//            System.out.println("Please enter a first name.");
//            firstName = myScanner.nextLine();
//
//        }while{
//            firstName.isBlank();
//
//        }

//        String middleName =
//        String lastName =
//        String suffix =


    }
}
