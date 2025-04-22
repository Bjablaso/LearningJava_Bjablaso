package travelaround.JavaBasic.Interface;


import java.util.List;

public class UnderstandingRecursion {
    public static int basicRecurstion(int n) {
        //base case
        if(n == 0){
            return 0;
        }

        if(n == 1){
            return 1;
        }
        int febnumber1 = basicRecurstion(n-1); // control mover the control value toward the base case

        int febnumber2 = basicRecurstion(n-2);
        System.out.println("Iteration 1: \n" + "Feb part1 :" + febnumber1 + "\t" + "Feb part2 :" + febnumber2);

        int fib = febnumber1 + febnumber2; // once we hit the base case calculation occure when we are returing from our caller

        System.out.println("fib part 1 + fib part 2 : " + fib);
        return fib ;
    }


    public static int exponentRecurstion(int base, int exponenet){
        if(exponenet == 0){
            return 1;
        }


        exponentRecurstion(base, exponenet - 1);// return the recursive control
        base *= base;

        return base;
    }

    /**
     * Recursive premutation
     * @param args
     */
    public static void allpossibleCombination (String[] args){

    }
    public static List<List<Integer>> permutationRecusion(int num) {
        return null;
    }

    private static void premutedHelper (int[] nums, boolean[] visited, List<List<Integer>> result) {

    }

    /***
     * Backtracking :
     * @param args
     */

    public static void main(String[] args) {
        // fex of 6
        int feb = basicRecurstion(6);

        System.out.println("fibonacci number of 6 : " + feb);

        int exponent = exponentRecurstion(6, 3);

        System.out.println("6 to the power of 3 is : " + exponent);

    }
}
