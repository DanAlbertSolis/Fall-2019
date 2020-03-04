//Dan Albert Solis
// 2/27/20
// Mid-term code
import java.util.*;

/**
 * class charCount that contains two methods and one private instance variable
 */
class charCount {

    private static int count = 0;

    /**
     * Checks if index value of string is -1 and if not, checks if index value is equal to requested character
     * if true, count++ and charCount is recursively called again with high - 1. If index value is not equal to requested character,
     * charCount is recursively called with high - 1
     * @param str
     * @param ch
     * @param high
     * @return
     */
    public static int charCount(String str, char ch, int high){

        if(high == -1){
            return 0;
        }
        else if(str.charAt(high) != ch)
            return charCount(str,ch,high-1);

        else {
            count++;
            return charCount(str, ch, high - 1);
        }

    }


    /**
     * Helper method that takes the inputted string, and finds the high value and returns count after calling
     * the recursive method
     * @param s1
     * @param ch
     * @return
     */
    public static int charCount(String s1, char ch){
        int high = s1.length() - 1;
        charCount(s1,ch,high);
        return count;
    }
}

public class CharacterCounter{
    public static void main(String[] args){
        charCount cc1 = new charCount();
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter a string: "); //Asks user for input string
        String str = stdin.nextLine();
        System.out.print("Enter a character: "); // asks user for input character
        char ch = stdin.next().charAt(0);

        System.out.println( "Number of occurrences of the character '"+ ch +"': "+ cc1.charCount(str,ch)); //Prints output

    }
}


