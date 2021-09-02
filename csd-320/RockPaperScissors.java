
//Katie Klein
//CSD 320
//2 April 2021
//Assignment 3: Rock, Paper, Scissors

/*
This program simulates a simple 'Rock, Paper, Scissors' game between the user
and the computer.
*/

package klein.mod3;
import java.util.Scanner;
        
public class RockPaperScissors {
    public static void main(String[] args) {
        //Create scanner
        Scanner input = new Scanner(System.in);        

        //Print welcome message
        System.out.println("Let's play Rock, Paper, Scissors!\n");
        
        //Generate computer's selection: random int 1, 2, or 3
        int computerNumber = (int)(Math.random() * 3 + 1);
       
        //Print rock/paper/scissors number options for user
        System.out.println(
            "Rock: 1\nPaper: 2\nScissors: 3\n");
        
        //Get number input from user
        System.out.print(
                "Enter 1, 2, or 3 to choose Rock, Paper, or Scissors: ");
        int userNumber = input.nextInt();

        input.close();
        
        //Save numbers as corresponding items (rock, paper, or scissors)
        String userChoice;        
        switch (userNumber) {
            case 1:
                userChoice = "Rock";
                break;
            case 2:
                userChoice = "Paper";
                break;
            case 3:
                userChoice = "Scissors";
                break;
            default:
                userChoice = "invalid";
                break;
        }
        
        String computerChoice;
        switch (computerNumber) {
            case 1:
                computerChoice = "Rock";
                break;
            case 2:
                computerChoice = "Paper";
                break;
            default:
                computerChoice = "Scissors";
                break;
        }
               
        /*Perform logic operations to determine winner*/

        //if user entered valid int
        if (userNumber == 1 || userNumber == 2 || userNumber == 3) {
            String result;
            int difference = userNumber - computerNumber;
            //logic for a tie
            if (userNumber == computerNumber){
                result = "It's a tie!";
            }
            //logic for scenarios where user wins
            else if (difference == -2 || difference == 1) {
                result = "You win!";
            }
            //logic for when user loses
            else {
                result = "You lost :/";
            }
        
            //Print computer and user choices, and result of the game
            System.out.println("\nThe computer chose " + computerChoice + " (" + computerNumber +
                "). You chose " + userChoice + " (" +
                userNumber + ").\n");
            System.out.println(result);
        }
        //if invalid int was entered
        else {
            System.out.println("Invalid number input.");
        }
    }
}
