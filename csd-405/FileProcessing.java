/* 
 * Katie Klein
 * CSD 405
 * 27 June 2021
 * Assignment 5 Program 2: File Processing
 */

/*
 * This program demonstrates creating a File and populating it
 * if it doesn't exist, or appending to it if it does already exist.
*/


// import statements
import java.io.*;
import java.util.*;

public class FileProcessing {
    public static void main(String[] args) throws IOException {
        // create new file object
        File dataFile = new File("data.file");

        // declare Scanner and PrintWriter variables
        PrintWriter output;
        Scanner input;

        // check if file already exists
        if (dataFile.exists()) {
            try {
                // append 10 new numbers to existing file
                output = new PrintWriter(new FileOutputStream(dataFile, true));
                for (int i = 0; i < 10; i++) {
                    output.print( ((int)(Math.random() * 100) + 1) + " ");
                }
                // close file
                output.close();      
            }
            catch(IOException ioe) {
                System.out.println("IOException - 1");
            }
        }
        else {
            try {
                // if it doesn't exist, create new file
                output = new PrintWriter(dataFile);
                // add 10 numbers to new file
                for (int i = 0; i < 10; i++) {
                    output.print( ((int)(Math.random() * 100) + 1) + " ");
                }
                // close file
                output.close();
            }
            catch(IOException ioe) {
                System.out.println("IOException - 2");
            }
        }
        
        // open file for reading
        input = new Scanner(dataFile);

        // read and display data from file
        System.out.println("DISPLAY FILE CONTENTS:");
        while (input.hasNext()) {
            System.out.println(input.next());
        }

        // close Scanner object
        input.close();        
    }
}
