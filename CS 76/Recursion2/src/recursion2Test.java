//Dan Albert Solis
// 2/20/2020
// Recursion: Part II
import java.util.Scanner;

class recursion2 {

    /**
     * Helper method calls displayPermutation(" ", s)
     * @param s STring
     */
    public static void displayPermutation(String s) {
        displayPermutation(" ", s);
    }

    /**
     * Method displays all possible permutations of String s2
     * @param s1 String
     * @param s2 STring
     */
    public static void displayPermutation(String s1, String s2) {
        if (s2.isEmpty()) //if s2 is empty, print permutation
            System.out.println(s1);
        else {
            for (int i = 0; i < s2.length(); i++) {
                displayPermutation(s1 + s2.charAt(i),s2.substring(0,i) + s2.substring(i + 1)); //recursively calls prestring + string2(@ index i ), s2(starting index) + s2(index + 1)
            }

        }
    }
}




public class recursion2Test {
        public static void main(String[] args){
            recursion2 recurs2 = new recursion2();
            Scanner stdin = new Scanner(System.in);


            System.out.print("Enter your string: ");
            recurs2.displayPermutation(stdin.nextLine());

        }
}
