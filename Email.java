
import java.io.*;
import java.util.*;
public class Email {
    private String firstName, lastName, password, department, email;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 8;
    private String companySuffix = "tienandco.com";

    // 1. Constructor to receive first and last name
    public Email (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        //System.out.println("Email created: " + this.firstName + " " + this.lastName);

        // 2. Call method asking for the department - return the department
        this.department = setDepartment();
        System.out.println("Department: " + this.department.substring(0,1).toUpperCase() + this.department.substring(1));

        // 6. Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "."  +companySuffix;
        //System.out.println("Your email is: " + email);

        // 4. Call a method that returns a random generated password
        this.password = randomPassword(defaultPasswordLength);
        //System.out.println("Your password is: " + this.password);
    }

    // 3. Ask for the department
    private String setDepartment () {
        System.out.println("Enter the department\n1. sales\n2.development\n3. accounting \n0. none");
        Scanner sc = new Scanner (System.in);
        int departmentChoice = sc.nextInt();
        switch (departmentChoice) {
            case 1:
                return "sales";
            case 2:
                return "development";
            case 3:
                return "accounting";
            default:
                System.out.println("Please enter a valid department.");
                setDepartment();
        }
        return "";
    }

    // 5. Generate a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$";
        // Create password length
        char [] password = new char [length];
        for (int i = 0; i < length; i++) {
            // 0 & 1 * 30
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String (password);
    }

    // Set mailbox Capacity
    public void setMailboxCapacity (int capacity) {
        this.mailboxCapacity = capacity;
    }

    // Change the password
    public void setPassword (String password) {
        this.password = password;
    }


    // Getter methods
    public int getMailboxCapacity () {
        return mailboxCapacity;
    }
    public String getPassword () {
        return password;
    }

    // 7. Print everything out
    public String showInfo () {
        return "Display name: " + firstName + " " + lastName
                + "\nCompany email: " + email +
                "\nPassword: " + password +
                "\nMailbox capacity: " + mailboxCapacity + "MB";
    }
}
