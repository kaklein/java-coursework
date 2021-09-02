//Katie Klein
//CSD 320
//2 April 2021
//Assignment 4: Substrings

/*
This program takes input of two strings from the user, then determines
whether each string is a substring of the other.
*/
package klein.mod4;
import java.util.Scanner;

public class Substrings {
    public static void main(String[] args) {
        //Create scanner
        Scanner input = new Scanner(System.in);   
        
        //Print welcome message
        System.out.println("SUBSTRING DETECTOR\n");
        
        //Get first string from user
        System.out.println("Enter first string:");
        String string1 = input.nextLine();
        
        //Get second string from user
        System.out.println("\nEnter second string:");
        String string2 = input.nextLine();

        input.close();
               
        //Declare booleans
        boolean string1InString2 = false;
        boolean string2InString1 = false;
        
        //Is string1 a substring of string2?
        if (string2.indexOf(string1) > -1) {
        string1InString2 = true;
        }
        
        //Is string2 a substring of string1?
        if (string1.indexOf(string2) > -1) {
        string2InString1 = true;
        }

        //Print result
        System.out.println("\nRESULTS:");
        if (!string1InString2 && !string2InString1) {
            System.out.println(
                    "Neither string is a substring of the other.");
        }
        if (string1InString2) {
            System.out.println(
                    "The first string is a substring of the second string.");
        }
        if (string2InString1) {
            System.out.println(
                    "The second string is a substring of the first string.");
        }                
    }    
}
