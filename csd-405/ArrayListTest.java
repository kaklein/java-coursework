/* 
 * Katie Klein
 * CSD 405
 * 27 June 2021
 * Assignment 4: ArrayList Test
 */

 /* 
  * This program creates an ArrayList of Integer objects populated
  * by user input and demonstrates a max method that returns the
  * largest value in the ArrayList.
  */

// import statements
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {
    public static void main (String[] args) {
    /* main method takes user input to create an ArrayList and tests the max method*/
        Scanner input = new Scanner(System.in); // create Scanner object

        // declare empty ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // display instructions for user input
        System.out.println("Input as many non-zero Integers as you choose. " +
            "\nThen input 0 and press Enter to end input:\n");        
        // get initial value of user input and add it to list
        Integer userInput = Integer.valueOf(input.nextInt());
        list.add(userInput);
        // continue getting user input until they enter 0
        while(userInput != 0) {
            userInput = input.nextInt();
            list.add(userInput);
        }

        // call max method
        Integer maxInteger = max(list);

        // display largest value returned from max method
        System.out.println("\nLargest value entered: " + maxInteger);

        input.close(); // close Scanner
    }

    public static Integer max(ArrayList list) {
    /* method that iterates through an ArrayList to find largest Integer value */
        if (!list.isEmpty()) { // check whether list is empty
            Integer maxInteger = (Integer)list.get(0);
            for (int i = 0; i < list.size(); i++) {
                Integer currentValue = (Integer)list.get(i);
                if(currentValue.compareTo(maxInteger) > 0) {
                    maxInteger = (Integer)list.get(i);
                }
            }
            return maxInteger;
        }
        else {
            return 0; // returns 0 if list is empty
        }       
    }
}