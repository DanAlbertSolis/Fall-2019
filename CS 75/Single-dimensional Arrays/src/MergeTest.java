/**
 * Student: Dan Albert Solis
 * Single-dimensional Arrays (Part 2 - Merge Two Sorted Lists)
 * Program contains am method that merges two separate PRE-SORTED lists of
 *  integers into a new sorted list
 */

import java.util.*;

public class MergeTest {

    /**
     * merge method that takes in two parameters, sorts the two parameter lists and returns
     *  one list
     * @param list1
     * @param list2
     * @return one big sorted list
     */
    public static int[] merge (int[] list1, int[] list2) {
        int current1,current2,current3,sumOfLists;
        sumOfLists = list1.length + list2.length;
        int[] sorted = new int[sumOfLists];

        current1 = 0;
        current2 = 0;
        current3 = 0;

        while (current1 < list1.length && current2 < list2.length){ // sorts the two separate lists
            if (list1[current1] <=  list2[current2]) {
                sorted[current3++] = list1[current1++];
            }
            else {
                sorted[current3++] = list2[current2++];
            }
        }

        if (current3 < sorted.length){ // checks if final list isn't completed and will complete if true
            while (current1 < list1.length) {
                sorted[current3++] = list1[current1++];
            }
            while (current2 < list2.length){
                sorted[current3++] = list2[current2++];
            }
        }
        return sorted;
    }

    public static void main (String[] args) {
        int size1, size2;

        Scanner stdin = new Scanner (System.in);

        // User-inputs information for list 1
        System.out.print("Enter size of list 1: ");
        size1 = stdin.nextInt();
        int[] list1 = new int[size1];
        System.out.print("Enter items in list 1: ");
        for (int i = 0; i <= size1 - 1; i++)
            list1[i] = stdin.nextInt();

        // User-inputs information for list 2
        System.out.print("Enter size of list 2: ");
        size2 = stdin.nextInt();
        int[] list2 = new int[size2];
        System.out.print("Enter items in list 2: ");
        for (int i = 0; i <= size2 - 1; i++)
            list2[i] = stdin.nextInt();

        System.out.println(Arrays.toString(merge(list1,list2))); // Prints new array using Array toString method
        // Can also use a loop to iterate through an array and print it
    }

}
