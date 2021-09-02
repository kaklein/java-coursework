//Katie Klein
//CSD 320
//3 May 2021
//Assignment 10: Overloaded Array Methods

/*
This program tests the use of overloaded methods with arrays.
There are four methods to calculate the average in an array, which take in
arrays of type short, int, long, and double, respectively. These methods are
called using test arrays as arguments. The original arrays and their averages
are then displayed.
*/


public class OverloadingArrays {
    // Main method
    public static void main(String[] args) {
        // Print header message
        System.out.println("-- Testing Overloaded Array Methods --\n");
        
        // Test short method
        // - create array (length 3)
        short[] shortArray = {10, 230, 87};

        // - call method
        short result1 = average(shortArray);

        // - print original array
        System.out.println("Original short array:");
        for (int i = 0; i < shortArray.length; i++) {
            System.out.print(shortArray[i]);
            if(i < shortArray.length - 1){
                System.out.print(", ");
            }
        }

        // - print average
        System.out.println("\nAverage of short array values:\n" + result1 + "\n");


        // Test int method
        // - create array (length 10)
        int[] intArray = {920, 14, 42, 775, -84, 4, 12, 650, -400, 16};

        // - call method
        int result2 = average(intArray);

        // - print original array
        System.out.println("Original int array:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]);
            if(i < intArray.length - 1){
                System.out.print(", ");
            }
        }

        // - print average
        System.out.println("\nAverage of int array values:\n" + result2 + "\n");


        // Test long method
        // - create array (length 6)
        long[] longArray = {2000, 56, 18, 1, -50, 475000};

        // - call method
        long result3 = average(longArray);

        // - print original array
        System.out.println("Original long array:");
        for (int i = 0; i < longArray.length; i++) {
            System.out.print(longArray[i]);
            if(i < longArray.length - 1){
                System.out.print(", ");
            }
        }

        // - print average
        System.out.println("\nAverage of long array values:\n" + result3 + "\n");


        // Test double method
        // - create array (length 4)
        double[] doubleArray = {23.3, 89.6, -42.9, 2.1};

        // - call method
        double result4 = average(doubleArray);

        // - print original array
        System.out.println("Original double array:");
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.print(doubleArray[i]);
            if(i < doubleArray.length - 1){
                System.out.print(", ");
            }
        }

        // - print average
        System.out.println("\nAverage of double array values:\n" + result4 + "\n");

    }


    // OVERLOADED AVERAGE METHODS

    // Average method - short
    public static short average(short [] array) {
        short sum = 0;
        short average;

        //find sum of array elements
        for (short i: array){
            sum += i;
        }

        //calculate average of array elements and return it
        average = (short)(sum / array.length);
        return average;
    }


    // Average method - int
    public static int average(int [] array) {
        int sum = 0;
        int average;

        //find sum of array elements
        for (int i: array){
            sum += i;
        }

        //calculate average of array elements and return it
        average = sum / array.length;
        return average;
    }


    // Average method - long
    public static long average(long [] array) {
        long sum = 0;
        long average;

        //find sum of array elements
        for (long i: array){
            sum += i;
        }

        //calculate average of array elements and return it
        average = sum / (long)array.length;
        return average;
    }


    // Average method - double
    public static double average(double [] array) {
        double sum = 0;
        double average;

        //find sum of array elements
        for (double i: array){
            sum += i;
        }

        //calculate average of array elements and return it
        average = sum / (double)array.length;
        return average;
    }

}