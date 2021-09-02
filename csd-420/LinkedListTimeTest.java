/* Katie Klein
 * CSD 420
 * 29 August 2021
 * Assignment 4
 */

/*
This program tests traversal time of LinkedLists using an Iterator vs the get(index) method.
This is tested first with a LinkedList of 50,000 integers and then one of 500,000 integers.
*/

import java.util.*;

public class LinkedListTimeTest {
    public static void main(String[] args) {
        // SMALLER LIST

        // create smaller LinkedList with 50,000 integers
        LinkedList<Integer> smallerLinkedList = new LinkedList<Integer>();
        for (int i = 0; i < 50000; i++) {
            smallerLinkedList.add(i);
        }

        // traverse smaller list with iterator
        long smallIteratorStart = System.nanoTime(); // get start time

        Iterator<Integer> smallIterator = smallerLinkedList.iterator(); // traverse list
        while (smallIterator.hasNext()) {
            smallIterator.next();
        }
 
        long smallIteratorFinish = System.nanoTime(); // get end time
        long smallIteratorTime = smallIteratorFinish - smallIteratorStart; // get total traversal time
 
        // traverse smaller list with get(index)
        long smallGetStart = System.nanoTime(); // get start time
 
        for (int i = 0; i < smallerLinkedList.size(); i++) { // traverse list
            smallerLinkedList.get(i);
        }
 
        long smallGetFinish = System.nanoTime(); // get end time
        long smallGetTime = smallGetFinish - smallGetStart; // get total traversal time

        
        // LARGER LIST

        // create larger LinkedList with 500,000 integers
        LinkedList<Integer> largerLinkedList = new LinkedList<Integer>();
        for (int i = 0; i < 500000; i++) {
            largerLinkedList.add(i);
        }
        
        // traverse larger list with iterator
        long largerIteratorStart = System.nanoTime(); // get start time

        Iterator<Integer> largeIterator = largerLinkedList.iterator(); // traverse list
        while (largeIterator.hasNext()) {
            largeIterator.next();
        }
 
        long largeIteratorFinish = System.nanoTime(); // get end time
        long largeIteratorTime = largeIteratorFinish - largerIteratorStart; // get total traversal time
 
        // traverse larger list with get(index)
        long largeGetStart = System.nanoTime(); // get start time
 
        for (int i = 0; i < largerLinkedList.size(); i++) { // traverse list
            largerLinkedList.get(i);
        }
 
        long largeGetFinish = System.nanoTime(); // get end time
        long largeGetTime = largeGetFinish - largeGetStart; // get total traversal time



        // PRINT RESULTS
        System.out.println("TRAVERSING LIST OF 50,000 INTEGERS");
        System.out.println("\tusing iterator: " + smallIteratorTime);
        System.out.println("\tusing get(next): " + smallGetTime + "\n");

        System.out.println("TRAVERSING LIST OF 500,000 INTEGERS");
        System.out.println("\tusing iterator: " + largeIteratorTime);
        System.out.println("\tusing get(next): " + largeGetTime);
    }

}

