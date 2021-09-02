/*
 * Katie Klein
 * CSD 420
 * 13 August 2021
 * Assignment 1
 * Reading Data
 */

/*
This program reads a file (created in StoreData.java) using the
ObjectInputStream class and displays the data.
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.BufferedInputStream;
import java.util.Date;

public class ReadData {
    public static void main (String[] args) throws IOException, ClassNotFoundException {
        // create input stream
        try (
            ObjectInputStream input = 
                new ObjectInputStream(new BufferedInputStream(new FileInputStream("kleindatafile.dat")));
        ) {
            // read data into input stream
            int[] intArray = (int[])(input.readObject());
            Date currentDate = (Date)(input.readObject());
            double[] doubleArray = (double[])(input.readObject());
            // display data
            System.out.println("\nINT ARRAY:"); // int array
            for (int item : intArray) {
                System.out.println(item);
            }            
            System.out.println("\nDATE:\n" + currentDate); // date
            System.out.println("\nDOUBLE ARRAY:"); // double array
            for (double item: doubleArray) {
                System.out.println(item);
            }
        } catch (IOException e) {
            System.out.print("IO Exception");
        } catch (ClassNotFoundException e) {
            System.out.print("Class Not Found Exception");
        }
    }
}
