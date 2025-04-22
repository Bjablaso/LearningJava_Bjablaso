package travelaround.JavaBasic;

import java.io.Console;
import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine(); // uses any primitive data type

        scanner.nextLine();
        System.out.println("Please enter your age: ");
        String age = scanner.nextLine();

//        Console myConsole = System.console();
//        System.out.println("Please enter your password: ");
//        String password = myConsole.readLine();// only uses string
//
//        System.out.println("Enter you number : ");
//        String number = myConsole.readLine();
//
        try{
            int num = Integer.parseInt(age);
            System.out.println("You are  " + num + "years old");

        }catch (NumberFormatException e){
            System.out.println("Please enter a number");
        }

        scanner.close();// close scanner when done
//        Console console = System.console();
//
//        System.out.println("Please enter a number");
//
//        if (console == null) {
//            System.out.println("No console available");
//        }
//
//        String userInput = console.readLine();
//
//
//            int number = Integer.parseInt(userInput);
//            System.out.println("Inter ger you enter is : " + number);
//            System.out.println("This integer as a Double is : " + Integer.valueOf(number).doubleValue());

    }
}
