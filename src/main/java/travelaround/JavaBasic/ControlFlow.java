package travelaround.JavaBasic;

import java.util.Collection;
import java.util.Scanner;

public class ControlFlow {


    public StringBuilder LoopFor(){

        return null;
    }

    public StringBuilder LooForEach(){
        return null;
    }

    public StringBuilder LoopWhile(){
        return null;
    }


    public StringBuilder LoopDoWhile(){
        return null;
    }

    public void forEACH(Collection<Object> collection){

    }

    public static void main(String[] args) {
        /**
         * Control statements: Are used to control the flow of execution within a program based on a certain condition
         *
         * Types
         *  If statements :
         *  If else statements:
         *  if else if statements:
         *  Switch statements:
         *
         *
         */
        Scanner scanner = new Scanner(System.in);

        // if state, if else, if else if : What are control statements used to evaluate a condition by executing a
        // block of cold if the condition within a statement is true. We use else To represent another block that will
        // //Be executed after the condition is fall. we use if else if statement to create a more condition to be evaluated


        System.out.println("Enter your age: ");

        int age = scanner.nextInt();

        if(age < 18) {
            System.out.println("Youare a minor");
        }else {
            System.out.println("Youare an adult");
        }

        //Switch statements evaluate an expression and executive block of code based on a matching cases;


        System.out.println("Enter today day in number ( valid digit 1 - 7) : ");
        int dayInNumber = scanner.nextInt();
        int todayis = dayInNumber; String day = "NAD";

        switch (todayis) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                    day = "Wednesday";
                    break;
            case 4:
                    day = "Thursday";
                    break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
           case 7:
               day = "Sunday";
               break;

            default:
                System.out.println("Not a valid day");
        }

        System.out.println(" Today is : " + day);
        scanner.close();


    }
}
