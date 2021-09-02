/*
 * Kate Klein
 * CSD 405
 * 1 July 2021
 * Assignment 6 - Division
 * DomesticDivision
 */

 /* This is a subclass of Division with fields and methods specific to domestic divisions */

public class DomesticDivision extends Division {
/* subclass of Division */

    // data fields
    String state;

    // constructor
    DomesticDivision(String divisionName, int accountNumber, String state) {
        super(divisionName, accountNumber);
        this.state = state;
    }

    // methods
    @Override
    void display() {
        System.out.println(divisionName.toUpperCase() + " DIVISION");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("State: " + state + "\n");
    }
}
