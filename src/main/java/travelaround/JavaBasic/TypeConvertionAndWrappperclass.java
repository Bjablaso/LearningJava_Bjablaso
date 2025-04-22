package travelaround.JavaBasic;

public class TypeConvertionAndWrappperclass {

    public static void main(String[] args) {

        /**
         * Conversion is the process of turning one data type into another
         */
        double pi = 3.14;

        // casting
        int piAsInt = (int) pi;

        System.out.println("casting double to int : "+ piAsInt);

        int wrapperCoversion = Double.valueOf(pi).intValue();
        System.out.println("using wrapper for conver : " + wrapperCoversion);

        String piString = Double.toString(pi);

        System.out.println("using wrapper to conver double to string for conver : " + piString);

        String parse = "String";
        double parseDouble = 0;
        try{
            parseDouble = Double.parseDouble(parse);

        }catch (NumberFormatException e){
            System.out.println("not a double precision number");
        }

        System.out.println(" Parsing string to a double precision point number : " + parseDouble);

    }
}
