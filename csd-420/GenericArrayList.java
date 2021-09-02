/*
 * Katie Klein
 * CSD 420
 * 29 August 2021
 * Assignment 4
 */

/*
This program tests a generic method (removeDuplicates) which takes an ArrayList and
returns a new ArrayList with all of the original values minus any duplicates.
*/

import java.util.ArrayList;

public class GenericArrayList {
    public static void main(String[] args) {
        // create ArrayList with 50 random values for testing
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 50; i++) {
            list.add((int)(Math.random() * 20 + 1));
        }

        // print original arraylist
        System.out.println("ORIGINAL ARRAYLIST:");
        for(int item : list) {
            System.out.print(item + " ");
        }
        System.out.println("\n");

        // remove duplicates with removeDuplicates method and print new arraylist
        ArrayList<Integer> noDupList = removeDuplicates(list);
        System.out.println("ARRAYLIST WITH DUPLICATES REMOVED:");
        for(int item : noDupList) {
            System.out.print(item + " ");
        }
    }


    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        // traverses list and adds each item to a new noDupList only if it's not already there
        ArrayList<E> noDupList = new ArrayList<>();

        for(E item : list) {
            if (!noDupList.contains(item)) {
                noDupList.add(item);
            }
        }

        return noDupList;
    }
}
