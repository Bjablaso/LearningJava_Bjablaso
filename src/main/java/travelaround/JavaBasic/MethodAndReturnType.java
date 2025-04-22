package travelaround.JavaBasic;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MethodAndReturnType {

    // contructor

    public static void changeVraible(){
        //change this value
        String message = "Hello";
        System.out.println("Message Before changing value vai Function call" + message);

       String newMessage =  methodVoid(message);

        System.out.println("new mmessage : "  + newMessage);
    }

    /**
     *
     */
    private static String methodVoid(String a){
        // change value in parameter without returning a thing;
        //here
        a += " World";

        return a;
    }

    /**
     *
     * @param a
     * @param b
     * @return
     */
    public static int  add(int a, int b){

        return a + b;
    }

    /**
     * When we need a method to return multiple values, we use an object or short form of a collection
     * This method displayed a list of individuals who are my friends and return them as one collection.
      * @return
     */
    public static  String[] MyFriend(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a name of all your friend seperated by a comma ( press whenter when don )  : ");
        String name = scanner.nextLine();


        return name.split(",");
    }

    // pass method as argument

    //calling method in other method
    public static  double Subdtract(){
        return 0;
    }

    // method chaining
    public MethodAndReturnType methodChaing(){
        return this;
    }

    public static void main(String[] args) {

        MethodAndReturnType.changeVraible();

        System.out.println("List of frient are" + Arrays.toString(MethodAndReturnType.MyFriend()));



    }
}
