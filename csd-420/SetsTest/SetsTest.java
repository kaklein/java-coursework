/* Katie Klein
 * CSD 420
 * 2 September 2021
 * Assignment 5
 */

/*
This program uses a TreeSet to store non-duplicate words from a text file,
then displays the words in both ascending and descending order.
*/

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;


public class SetsTest {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            // load text file called collection_of_words.txt into Scanner object
            File file = new File("collection_of_words.txt");
            Scanner input = new Scanner(file);
        
            // store words from file in TreeSet (duplicates will be removed)
            TreeSet<String> wordSet = new TreeSet<>();
            while(input.hasNext()) {
                wordSet.add(input.next());
            }

            input.close();
        
            // display TreeSet (in ascending order by default)
            System.out.println("NON-DUPLICATE WORDS IN ASCENDING ORDER:");
            for(String word : wordSet) {
                System.out.println("\t" + word);
            }
            System.out.println();

            // display TreeSet in descending order
            System.out.println("NON-DUPLICATE WORDS IN DESCENDING ORDER:");
            TreeSet<String> reverseSet = (TreeSet)wordSet.descendingSet();
            for(String word : reverseSet) {
                System.out.println("\t" + word);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found.");
        }
    }
}
