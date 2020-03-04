//Dan Albert Solis
// 2/20/2020
// Recursion: Part I

import java.util.Scanner;

class Recursion{

    //private instance variable
    private static String str = "";

    /**
     * Helper method that calls reverseDisplay(String, int)
     * @param value
     */
    public static void reverseDisplay(String value){
        reverseDisplay(value,value.length());

    }

    /**
     * Helper method that recursively calls itself until int high reaches base case of 0
     * @param value
     * @param high
     */
    public static void reverseDisplay(String value, int high){

        if (high == 0){
            System.out.println(str);
        }
        else {
            str += value.charAt(high - 1);
            reverseDisplay(value, high - 1);
        }

    }
}

public class recursionTest {
    public static void main(String[] args){
        String str;
        Scanner stdin = new Scanner(System.in);
        Recursion recur1 = new Recursion();

        System.out.print("Enter your string: ");
        str = stdin.nextLine();
        recur1.reverseDisplay(str);


    }
}
