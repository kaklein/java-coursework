/* 
 * Katie Klein
 * CSD 405
 * 27 June 2021
 * Assignment 5 Program 1: String ArrayList
 */

/* 
 * This program creates and displays an ArrayList of String objects,
 * then takes user input to select one of the strings to display again.
 * A try/catch block is used to handle exceptions where the user input
 * is out of bounds.
 */

// import statements
import java.util.ArrayList;
import java.util.Scanner;

public class TryCatchTest {
    public static void main(String[] args) {
        //make new ArrayList and add 10 values
        ArrayList<String> tenStringList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            tenStringList.add("This is string " + i);
        }

        //print ArrayList using for-each loop
        System.out.println("ARRAYLIST OF STRINGS:"); //print header line
        for (String item : tenStringList) {
            System.out.println("  " + item);
        }

        //create Scanner object
        Scanner input = new Scanner(System.in);

        //display instructions for user input
        System.out.println("\nEnter the number (0-9) of the string you want to see again:");

        //get user input
        String userInput = input.next();

        //convert String to int
        int indexInt = Integer.parseInt(userInput);

        //demonstrate autoboxing - int to Integer
        Integer indexInteger = indexInt;        

        //try/catch block to get input from user and display selected string
        try {
            //try to find chosen index in ArrayList
            String stringToPrint = tenStringList.get(indexInteger); //demonstrate auto-unboxing - Integer to int

            //display chosen String
            System.out.println("\nSTRING " + indexInteger + ":");
            System.out.println("  " + stringToPrint);
        }
        catch (IndexOutOfBoundsException ex) { //print exception message
            System.out.println("\nEXCEPTION: Out of Bounds");
        }

        input.close(); //close Scanner
    }
 }