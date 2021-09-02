//Katie Klein
//CSD 320
//24 April 2021
//Assignment 7: Password Rules/Methods

/*
This program takes a password as user input and uses methods to check
whether it's valid against the following rules:

1. A password must have at least eight characters.
2. A password must contain both letters and digits.
3. A password must contain at least one uppercase character.
4. A password must contain at least one lowercase character.

*/

//Import statements
import java.util.Scanner;

public class PasswordValidation {
    //MAIN METHOD
    public static void main(String[] args) {
        
        //Create scanner
        Scanner input = new Scanner(System.in);

        //Print title and instructions
        System.out.println("PASSWORD CHECKER");
        System.out.println("Your password must:"
        + "\n\t1. have at least 8 characters"
        + "\n\t2. contain both letters and digits"
        + "\n\t3. contain at least one uppercase and one lowercase letter\n");
        
        //Get input string with scanner
        System.out.println("Please enter a password:");
        String password = input.next();

        //Call passwordCheck method to analyze validity of password
        if (passwordCheck(password)) {
            System.out.println("\nTHANK YOU, YOUR PASSWORD IS VALID! :)");
        }
        else {
            System.out.println("\nINVALID PASSWORD. >:(");
        }
        input.close();
    }

    //METHOD TO CHECK PASSWORD VALIDITY
    public static boolean passwordCheck(String password) {
        boolean validPassword = true; //initialize boolean value

        //Check against each password rule check method
        while(true) { //If one of these checks is false, we stop checking
            if (!checkLength(password)) {
                validPassword = false;
                break;
            }
            if (!checkForLetters(password)) {
                validPassword = false;
                break;
            }
            if (!checkForDigits(password)) {
                validPassword = false;
                break;
            }
            if (!checkForUppercase(password)) {
                validPassword = false;
                break;
            }
            if (!checkForLowercase(password)) {
                validPassword = false;
                break;
            }
            break;
        }
        return validPassword;
    }

    //PASSWORD RULE CHECK METHODS

    // - Check for at least 8 CHARACTERS IN LENGTH
    public static boolean checkLength(String password) {
        boolean validLength = false;
        if (password.length() >= 8) {
            validLength = true;
        }
        return validLength;
    }

    // - Check for at least one LETTER
    public static boolean checkForLetters(String password) {
        boolean containsLetter = false;
        for (int i = 0; i < password.length(); ++i) {
            if (Character.isLetter(password.charAt(i))) {
                containsLetter = true;
                break;
            }
        }
        return containsLetter;
    }

    // - Check for at least one DIGIT
    public static boolean checkForDigits(String password) {
        boolean containsNumber = false;
        for (int i = 0; i < password.length(); ++i) {
            if (Character.isDigit(password.charAt(i))) {
                containsNumber = true;
                break;
            }
        }
        return containsNumber;
    }

    // - Check for at least one UPPERCASE character
    public static boolean checkForUppercase(String password) {
        boolean containsUpperCase = false;
        for (int i = 0; i < password.length(); ++i) {
            if (Character.isUpperCase(password.charAt(i))) {
                containsUpperCase = true;
                break;
            }
        }
        return containsUpperCase;
    }

    // - Check for at least one LOWERCASE character
    public static boolean checkForLowercase(String password) {
        boolean containsLowerCase = false;
        for (int i = 0; i < password.length(); ++i) {
            if (Character.isLowerCase(password.charAt(i))) {
                containsLowerCase = true;
                break;
            }
        }
        return containsLowerCase;
    }

}