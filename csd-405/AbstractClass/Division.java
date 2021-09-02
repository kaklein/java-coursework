/*
 * Kate Klein
 * CSD 405
 * 1 July 2021
 * Assignment 6 - Division
 * Division
 */

 /* This is an abstract base class for any type of division */

public abstract class Division {
/* abstract superclass of InternationalDivision and DomesticDivision */

    // data fields
    String divisionName;
    int accountNumber;

    // constructor
    protected Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    // methods
    abstract void display();
}

