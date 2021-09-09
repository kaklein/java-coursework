/* Katie Klein
 * CSD 420
 * 9 September 2021
 * Assignment 6: Bubble Sort
 */

/*
This program demonstrates bubble sort of a list through two generic methods,
one that uses the Comparable interface and one that uses the Comparator interface.
*/

import java.util.Comparator;

public class BubbleSort {

    // bubbleSort using Comparable
    public static <E extends Comparable<E>> void bubbleSort(E[] list) {
        boolean needNextPass = true;

        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            // iterate through list to check for swaps on the kth pass
            for (int i = 0; i < list.length - k; i++) {
                //compare current element with next element using compareTo
                if (list[i].compareTo(list[i + 1]) > 0) {
                    //swap elements if first one is greater than second
                    E temp = list[i + 1];
                    list[i + 1] = list[i];
                    list[i] = temp;
                    needNextPass = true;
                }
            }
        }
    }

    // bubbleSort using Comparator
    public static <E> void bubbleSort(E[] list, Comparator<? super E> comparator) {
        boolean needNextPass = true;

        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            // iterate through list to check for swaps on the kth pass
            for (int i = 0; i < list.length - k; i++) {
                //compare current element with next element using comparator.compare
                if (comparator.compare(list[i], list[i + 1]) > 0) {
                    // swap elements if first one is greater than second
                    E temp = list[i + 1];
                    list[i + 1] = list[i];
                    list[i] = temp;
                    needNextPass = true;
                }
            }
        }
    }

    // method to print list
    public static <E> void printList(E[] list) {
        for (E element : list) {
            System.out.print(element + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        // Test bubble sort with Comparable method
        System.out.println("TESTING BUBBLESORT USING COMPARABLE INTERFACE\n");

        Integer[] intArray1 = new Integer[10];
        for (int i = 0; i < intArray1.length; i++) {
            intArray1[i] = (int)(Math.random() * 9 + 1);
        }

        System.out.println("Original list:"); // print original list
        printList(intArray1);


        bubbleSort(intArray1); // call bubbleSort method

        System.out.println("Sorted list:"); // print sorted list
        printList(intArray1);


        System.out.println("--------------------------------------------");


        // Test bubble sort with Comparator method
        System.out.println("\nTESTING BUBBLESORT USING COMPARATOR OBJECT\n");

        String[] stringArray1 = {"baa", "moo", "meow", "bark", "neigh", "oink", "cluck"};

        System.out.println("Original list:"); // print original list
        printList(stringArray1);

        Comparator<String> com = (str1, str2) -> { // create Comparator object
            if (str1.compareTo(str2) > 0) return 1;
            else return -1;
        };

        bubbleSort(stringArray1, com); // call bubbleSort method using Comparator object

        System.out.println("Sorted list:"); // print sorted list
        printList(stringArray1);
    }
}
