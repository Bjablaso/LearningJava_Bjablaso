package travelaround.JavaBasic;

public class DataTypesAndVariable {

    // what are variable ? name storage location (Meaning of variable identifiers that associates where data
    //  is being store with our program

    //There are four types of variables (Instance variable, Local variable, Static variable, Perimeter variable)
        /*
         Instance variable - A non-static variable field that are declared inside a class, but outside all methods and constructors
            - Scope: Access within a class and can be access anywhere within that class.

        Static variable - Variable a.are declared with the static keyword. This river will share among all instance of the class.
        There's only one copy of this.
            - Scope: Can be accessed anywhere within a class

        Local variable - Declared within a method constructor or a block.
            - Scope: Available only within a method constructor or block in which it is
            declared and exists until the end of that block

            Perimeter variable: Are being passed through a perimeter to a method or constructor.
                - Scope: Exist within a methyl constructor can only be accessed within a method of constructor

         */

    private int num; // instance variable
    static   int number =  10 ;  // static variable

    public DataTypesAndVariable(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public static int getNumber() {
        return number;
    }

    public static void main(String[] args) {
        //standaard output is a string
        System.out.println("Hello world "); // how you print thing out to the console
        System.out.println("Hello world" + "Me "); //  concatinate string


        DataTypesAndVariable myClass = new DataTypesAndVariable(20); //
        DataTypesAndVariable newMyClass = new DataTypesAndVariable(30); //


        System.out.println("Four instance variable, each data type is different for each instance of the class" +
                "Because each class holds its own reference to the variable");
        System.out.println("Class 1"+ myClass.getNum());
        System.out.println(" Class 2"+ newMyClass.getNum());

        System.out.println("With a static variable, there's only one reference that share amongst our classes" +
                "Therefore, there is one piece of data being share");

        System.out.println("Class 1" + myClass.number);
        System.out.println("class 2" + newMyClass.number);

        /**
         * Data type: are keywords that determine what type of data is that a variable hold.
         *
         * There are two types of data type
         *  - Primitive: Primitive data type holds simple raw data ( These include: Boolean, char, byte, int, floaat, and double)
         *  -Non-primitive: Are known as reference types, These that type do not hold the data itself, but hold reference to where to find the data
         *   (These include classes, Objects, Enums, Interfaces, Arrays, Records)
         *
         */

        // primitive data type

        /**
         *   //Integers (int): Are use the store whole number (32 bits) -2,000,000,000 to + 2 billion
         *            // - Use Cases:
         *            // Use for counting, Controlling dupes, Indexing, Earth medic operations, And
         */

        int itemCount = 100;
        System.out.println("this is an integer in java " + itemCount);

        /**
         * Double : Permitted data types that hold 64 bits of double precision numbers that I used to represent Precise calculation
         *
         *  - Use Cases:
         *          - Financial calculation, Scientific comp, Statistics, Metrics, Variance,
         */
        double accountBalance = 100.48;
        System.out.println("this is an Double in java " + accountBalance);

        /**
         * Characters (char): Are 16 bits unicorn characters used to hold a single character including numbers letters
         * symbols enclose in sing;le 'quotes'
         *
         *  - Use Cases:
         *      - Holden single character inputs, Processing tech, Processes, symbols, and letters, Store symbols and letters;
         *
         */

        char charater = 'A';
        System.out.println("this is a character in java " + charater);


        /**
         * Bpplean (bool): Is that a typing Java that holds two values: true / false. (only one bit)
         *
         *  - Use Cases:
         *      - Condition check, Flags, State management;
         *
         */

        boolean istrue = false;

        System.out.println("this is a boolean in java " + istrue);

        /**
         * String: My data type used to hold words, text and numbers enclose in double  "quotation".
         *
         *     Use cases:
         *      - Store text, Formatting output, Transferring data
         */


        String name = "Hello";
        System.out.println("this is a String in java " + name);

        //Honorable mention

        long  data = 33345324;
        System.out.println("this is a long in java " + data);

        byte myBytes = (byte) 177;
        System.out.println("this is a byte in java (177) " + myBytes);

        /**
         * Reference data type: Are used to declare variable that holds references to data. Think of reference as an address or plant to where the data is in a store.
         *  - (Classes, Interface, RArray, Enum and Record
         * this will be covered later
         */

        //standaard output is a string
        System.out.println("Hello world "); // how you print thing out to the console
        System.out.println("Hello world" + "Me "); //  concatinate string

        /**
         * StringBuilder : Is a class in Java that allow us to create a mutable sequence of character.
         * So we use this to create a place where we can store our output and formatted in one spot.
         *
         * Use Cases :
         *      - Used to organize output in order to display to the user and create modified string
         */

        StringBuilder stringBuilder = new StringBuilder(); // create a string builderWanna

        // addd element to the string builder
        stringBuilder.append("Hello there\n");

        System.out.printf("String builder index 0 " + stringBuilder.toString());

        stringBuilder.insert(0, "Hello People\n");


        System.out.printf("String builder index 0 " + stringBuilder.toString());

        stringBuilder.append("This is a string builder\n");
        // insert element -> Allow us to intern an element at a specific index

        // reverse order of the builder
        stringBuilder.reverse();
        System.out.printf("String builder index 0 " + stringBuilder.toString());

        stringBuilder.delete(0,1); // delet in a rage

        stringBuilder.append(String.format("%n%-20s %-15s %-10.2f %-5d", "Brandon Jablasone", "17-june 2000", 3.02, 24));

        System.out.println(stringBuilder.toString());





    }
}
