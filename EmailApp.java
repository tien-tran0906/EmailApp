import java.util.*;
import java.io.*;
public class EmailApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter first name: ");
        String firstName = sc.nextLine();
        System.out.println("Enter last name: ");
        String lastName = sc.nextLine();
        Email eml = new Email (firstName, lastName);
        System.out.println(eml.showInfo());

        System.out.println("\nDo you want to reset your password? \n1. Yes \t2. No");
        int input = sc.nextInt();
        sc.nextLine();
        if (input == 1) {
            System.out.println("Please enter your new password:");
            String newPassword = sc.nextLine();
            eml.setPassword(newPassword);
            System.out.println(eml.showInfo());
        } else {
            System.out.println(eml.showInfo());
        }
    }
}