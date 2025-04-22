package travelaround.JavaBasic;

import org.w3c.dom.ls.LSOutput;
import travelaround.JavaBasic.Interface.ExampleOfInterface;
import travelaround.JavaBasic.Interface.funcInterface;

import java.util.ArrayList;
import java.util.List;

public class oPERATORandOperations {

    public static void printMessage(String message){
        System.out.println(message);
    }

    public static int operation(int a , int b, char operator){
        switch(operator){
            case '+':
                return a + b;

            case '-':
                return a - b;

            case '*':
                return a * b;

            case '/':
                return a / b;
            case'%'   :
                return a % b;

            default:
                System.out.println("Invalid operator");
        }
        return 0;
    }


    public static void main(String[] args) {
        /**
         * Operators:Operators in Java or special symbols that perform operations.
         *
         * Types
         *  Arithmetic Operator: Are you a perform earth Matic operation such as
         *     addition (+), subtraction(-), multiplication(*), division(/), and modulus(%).
         *
         *      Use cases:
         *
         * Relational operator: Are used to compare two values and return a bullion result(true or false)
         *  (Equal to ==, Not equal to !=, Greater than >, Less than <, Greater than equal to >=, Less than equal to <=))
         *
         *  Logical operators: Perform logical operation by comparing operand options and returning a bowling value.
         *   (AND &&, OR ||, NOT !)
         *
         *   Assignment operators: Assign value to a variable and perform operation at the same time (+=, -=, *=, /=)
         *
         *   Unary operators: Operate on a single operands (++, --)
         *
         *   Ternary operator: A short form of an if statement
         *
         *   Instead of operator: Used to test if an object is an instance of a particular class or interface
         *
         *   Type cast operator: Convert one data to another
         */

        // Arithmetic Operation

        int number1 = 100; int number2 = 10;

        int sumAdd = number1 + number2;
        int sumSub = number1 - number2;
        int sumMult = number1 * number2;
        int sumDiv = number1 / number2;// reurn the qoutient
        int sumMod = number1 % number2; // return the remainder of the operation (which is how many times can a number go in to another number and what is left over)

        System.out.println("Addition of " + number1 + " and " + number2 + " is " + sumAdd);
        System.out.println("Subtraction of " + number1 + " and " + number2 + " is " + sumSub);
        System.out.println("Multiplication of " + number1 + " and " + number2 + " is " + sumMult);
        System.out.println("Division of " + number1 + " and " + number2 + " is " + sumDiv);
        System.out.println("Modulation of " + number1 + " and " + number2 + " is " + sumMod);

        // Unary operator

        int sum = 0;
        sum += 1;
        sum -= 2;
        sum *= (1+2);
        sum /= 7;
        sum %= 3;

        System.out.println("Sums is "+ sum);
        System.out.println("unary operator += 1 " + sum);
        System.out.println("unary operator -=2 " + sum);
        System.out.println("unary operator *= (1+2) " + sum);
        System.out.println("unary operator /= 7 " + sum);
        System.out.println("unary operator %= 3 " + sum);


        // comparator  operation
        boolean isGreater = (number1 > number2);

        System.out.println(isGreater + " : number one is  greater than  number two ");

        boolean isLesser = (number1 < number2);

        System.out.println(isLesser + " : number one is less than  number two ");

        boolean equalTo = (number1 == number2);
        System.out.println(equalTo + " : number one is equal to number two ");

        boolean notEqualto = (number1 != number2);
        System.out.println(notEqualto + " :  number one is not equal to number two ");


        //instance of operation

        List<Object> lsit = new ArrayList<Object>();
        List<Integer> mylist = new ArrayList<>();
        lsit.add(number1);
        lsit.add(number2);
        lsit.add(mylist);

        for (Object o : lsit) {
            if (o instanceof Integer) {
                System.out.println("instance");
            }else{
                System.out.println("not instance");
            }
        }

        funcInterface messanger = oPERATORandOperations::printMessage;
        messanger.sayHello("Hello World");

        // what is a lambda expression: A lambda implements a functional interface, which has a single abstract method (SAM).


        // Lambda expression for printing messages
        funcInterface message = msg -> System.out.println("Message: " + msg);

        // Call the method using the lambda
        message.sayHello("Hello, Lambda!");


        ((funcInterface) msg -> System.out.println("Message: " + msg)).sayHello("Hello, Lambda!");

        // bad
        ExampleOfInterface addition = (a, b, operator) -> {
            switch(operator){
                case '+':
                    return a + b;

                case '-':
                    return a - b;

                case '*':
                    return a * b;

                case '/':
                    return a / b;
                case'%'   :
                    return a % b;

                default:
                    System.out.println("Invalid operator");
            }
            return 0;
        };
        int result = addition.operation(2, 2, '/');

        System.out.println(result);

        ExampleOfInterface result2 = oPERATORandOperations::operation;

        int operationResult = result2.operation(2, 2, '/');
        System.out.println(result);



    }

    /**
     *  passing method behavior around
     * @param func
     * @param x
     * @param y
     * @param operator
     */
    public static void executeOperation(ExampleOfInterface func, int x, int y, char operator) {
        int result = func.operation(x, y, operator);
        System.out.println("Result: " + result);
    }

    
    

}



