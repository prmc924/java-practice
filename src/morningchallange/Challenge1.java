package morningchallange;

/**
 * Created by Jay Vaghani
 */

import java.util.Scanner;

/**
 * Write a java program using the following requirement.
 * 1.Create a Java class with name 'Challenge1'
 * 2.Create a main method.
 * 3.Declare the Two String type variables with names 'name' and 'message' and assign value is
 * 'name'= 'Your name(Jay)' and 'message'= 'Good Morning'
 * 4.Print the following message using above variables, println statements and Concatenation.
 */
public class Challenge1 {

    public static void main(String[] args) {
        //Scanner object created
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Greeting Message: ");
        String message = scanner.nextLine();
        //Method call
        printMessage(name, message);
        // close scanner object
        scanner.close();
    }

    public static void printMessage(String name, String message) {
        System.out.println("Hi " + name);
        System.out.println(message);
    }
}
