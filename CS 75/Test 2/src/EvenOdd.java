// Dan Solis
// COMSC 075 - Midterm 2 - Fall 2019 - Lab
// Separates even and odd elements of an integer array
import java.util.*;

public class EvenOdd {

    /**
     * Main driver, prompts user for input, declares and intializes array then prints it out
     * @param args
     */
    public static void main (String[] args){
        int arrayElements;
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter an integer for the size of the array: "); //Asks user for input
        arrayElements = stdin.nextInt();

        while (arrayElements <= 0){ // Checks if user input is not 0 or a negative number
            System.out.print("Enter a different number: ");
            arrayElements = stdin.nextInt();
        }

        int[] data = new int [arrayElements]; // data declaration

        System.out.print("Please enter the 8 element(s): "); //Places elements in an array
        for (int i = 0; i < arrayElements; i++){
            data[i] = stdin.nextInt();
        }
        printArray(separate(data));

    }

    /**
     * separate method takes an array and places the even values first, then the odds, then returns the sorted array
     * @param data input-array
     * @return a sorted array from even to odd
     */
    public static int[] separate(int[] data){
        int current = 0;
        int[] sortedArray = new int [data.length];


        for (int i = 0; i < data.length; i++){ //Sorts evens first by % by 2
            if (data[i] % 2 == 0)
                sortedArray[current++] = data[i];
        }
        for (int i = 0; i < data.length; i++){ //Sorts odds and uses last place "current"
            if (data[i] % 2 != 0)
                sortedArray[current++] = data[i];
        }
        return sortedArray;
    }

    /**
     * Prints array using a for-loop
     * @param a
     */
    public static void printArray(int[] a){
        System.out.println("Separated array:");
        for (int i = 0; i < a.length;i++)
            System.out.print(a[i] + " ");
    }

}
