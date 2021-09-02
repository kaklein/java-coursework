/*
 * Kate Klein
 * CSD 405
 * 1 July 2021
 * Assignment 6 - Division
 * UseDivision
 */

 /* This program demonstrates the use of the InternationalDivision and DomesticDivision subclasses
 by instantiating two objects of each subclass with their respective constructors, and then calling
 the display method which also differs slightly for each subclass. */

public class UseDivision {
    public static void main (String[] args) {
        // display header for International Divisions
        System.out.println("\n-- International Divisions --\n");
        
        // create 2 instances of InternationalDivision
        InternationalDivision intlDivision1 = new InternationalDivision("Europe", 20008983, "Germany", "German");
        InternationalDivision intlDivision2 = new InternationalDivision("Middle East", 20002184, "Egypt", "Arabic");

        // call display method on InternationalDivision objects
        intlDivision1.display();
        intlDivision2.display();

        
        // display header for Domestic Divisions
        System.out.println("\n-- Domestic Divisions --\n");

        // create 2 instances of DomesticDivision
        DomesticDivision domDivision1 = new DomesticDivision("Pacific Northwest", 10001413, "Washington");
        DomesticDivision domDivision2 = new DomesticDivision("New England", 10001100, "Massachusetts");

        // call display method on DomesticDivision objects
        domDivision1.display();
        domDivision2.display();
    }
}



