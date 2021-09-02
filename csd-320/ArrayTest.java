//Katie Klein
//CSD 320
//29 April 2021
//Assignment 9: Arrays

/*
This program takes 20 integers as user input and stores them in an array.
Then the following values are calculated and displayed:
    - The highest value entered
    - The lowest value entered
    - The average of the numbers entered
    - The sum of the numbers entered

*/

//Import statements
import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        //Create Scanner
        Scanner input = new Scanner(System.in);

        //Create empty array to hold 20 ints
        int[] intArray = new int[20];
        
        //Display header and instructions
        System.out.println("-- FUN WITH ARRAYS! --");
        System.out.println("Please enter 20 integer values:");

        //Get input of 20 integers from user and store in array
        for (int i = 0; i < intArray.length; i++) {
            int newValue = Integer.parseInt(input.next());
            intArray[i] = newValue;
        }

        //Calculate highest value in array (max)
        int max = intArray[0];
        for (int i: intArray) {
            if (i > max) {
                max = i;
            }
        }

        //Calculate lowest value in array (min)
        int min = intArray[0];
        for (int i: intArray) {
            if (i < min) {
                min = i;
            }
        }

        //Calculate sum of numbers in array (sum)
        int sum = 0;
        for (int i: intArray) {
            sum += i;
        }

        //Calculate average of numbers in array (average)
        double average = (double)sum / intArray.length;

        //Display results
        System.out.println("\n-- ARRAY ANALYSIS --");
        System.out.println("Highest value: " + max);
        System.out.println("Lowest value: " + min);
        System.out.println("Average: " + average);
        System.out.println("Sum: " + sum);

        //Close scanner
        input.close();
    }
}