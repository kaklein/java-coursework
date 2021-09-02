/*
 * Kate Klein
 * CSD 405
 * 1 July 2021
 * Assignment 6 - Division
 * InternationalDivision
 */

 /* This is a subclass of Division with fields and methods specific to international divisions */

public class InternationalDivision extends Division {
/* subclass of Division */

    // data fields
    String country;
    String language;

    // constructor
    InternationalDivision(String divisionName, int accountNumber, String country, String language) {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    // methods
    @Override
    void display() {
        System.out.println(divisionName.toUpperCase() + " DIVISION");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Country: " + country);
        System.out.println("Language: " + language + "\n");
    }
}
