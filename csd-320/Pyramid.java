//Katie Klein
//CSD 320
//15 April 2021
//Assignment 6: Nested Loops Pyramid

/*
This program prints a pyramid of numbers with each row
containing evenly incrementing and decrementing powers of 2
*/

public class Pyramid {
    public static void main(String[] args) {
        //initialize variables
        int row;
        double power;
        int num;
        int spaces_before = 35;
        int spaces_after = 14;

        //loop through each row of the pyramid
        for (row = 1; row <= 7; ++row) {
            
            //print the correct number of spaces before the numbers
            for (int j = spaces_before; j > 0; --j) {
                System.out.print(" ");
            }

            //print increasing numbers (powers of 2)
            for (power = 0; power < row; ++power) {
                num = (int) Math.pow(2, power);
                System.out.print(num + " ");
            }
            //print decreasing numbers (powers of 2)
            for (power = power - 2; power >= 0; --power) {
                num = (int) Math.pow(2, power);
                System.out.print(num + " ");
            }
            
            //print the correct number of spaces after the numbers
            for (int j = spaces_after; j > 0; --j) {
                System.out.print(" ");
            }

            //print @ symbol and new line at the end of each row
            System.out.println("@");

            //update space variables for next row            
            if (row < 4) spaces_before -= 2; //update spaces_before for first 4 rows
            else spaces_before -= 3; //update spaces_before for last 3 rows

            if (row < 5) spaces_after -= 2; //update spaces_after for first 5 rows
            else spaces_after -=3; //update spaces_after for last 2 rows
        }
    }
}
