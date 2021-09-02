
//Katie Klein
//CSD 320
//25 March 2021
//Assignment 2

/*
This program takes user inputs of water mass and initial and final temps
and calculates the energy in Joules needed to heat that amount of water to
the final temp.
*/

package klein.mod2;
import java.util.Scanner;

public class EnergyCalculator {
    public static void main(String[] args) {
        //Create Scanner for input
        Scanner input = new Scanner(System.in);
        
        //Print header message
        System.out.println("ENERGY REQUIREMENT CALCULATOR\n");
        
        //Gather inputs 
        System.out.print("Enter mass of water (kilograms): ");
        double waterMass = input.nextDouble();
        
        System.out.print("Enter water's initial temperature (Celsius): ");
        double initialTemperature = input.nextDouble();
        
        System.out.print("Enter water's final temperature (Celsius): ");
        double finalTemperature = input.nextDouble();

        input.close();
        
        //Calculate energy needed according to formula:
        //  Q = waterMass (finalTemperature – initialTemperature) x 4184
        double result = waterMass * (finalTemperature - initialTemperature)
                * 4184;
        
        //Print message with result
        System.out.println("\nEnergy needed to heat " + waterMass +
                " kilograms of water from " + initialTemperature + " to "
                + finalTemperature + " degrees Celsius:\n" + result +
                " Joules");
    }
    
}
