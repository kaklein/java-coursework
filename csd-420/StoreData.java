/*
 * Katie Klein
 * CSD 420
 * 13 August 2021
 * Assignment 1
 * Storing Data
 */

/*
This program creates several objects and outputs them to a file using the
ObjectOutputStream class.
*/

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class StoreData {
    public static void main (String[] args) throws IOException {        
        // create array of five random integers
        int[] intArray = new int[5]; 
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int)((Math.random() * 100) + 1);
        }
        // create Date object using current date
        Date currentDate = new Date();
        // create array of five random double values
        double[] doubleArray = new double[5];
        for (int i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = (Math.random() * 100) + 1;
        }

        // create output stream
        try (
            ObjectOutputStream output = 
                new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("kleindatafile.dat")));
        ){
            // write data to output file
            output.writeObject(intArray);
            output.writeObject(currentDate);
            output.writeObject(doubleArray);
        } catch (IOException e) {
            System.out.print("IO Exception");
        }    
    }
}