/**
 * Student: Dan Albert Solis
 * Single-dimensional Arrays (Part 1 - Locker Puzzle)
 * Displays lockers of 100 lockers and students after a school day
 */

public class LockerPuzzle {
    public static boolean[] lockers = new boolean[100];

    public static void main (String[] args) {

        // Lockers initialized to closed
        for (int i = 0; i < lockers.length; i++)
            lockers[i] = false;

        // First student opens all lockers
        for (int i = 0;i < lockers.length; i++)
            lockers[i] = true;

        // Second student closes every other locker
        for (int i = 1; i > lockers.length; i+=2) {
            lockers[i] = false;
        }

        int student = 2; // Third student

        //nStudent visits nLocker and will close or open (depending on what the locker already is) the locker and skips nLockers until the 100th student.
        while (student < lockers.length) {
            for (int i = student; i < lockers.length; i += student + 1 ) {
                if (lockers[i] == true)
                    lockers[i] = false;
                else
                    lockers[i] = true;
            }

            student++;

        }


        /**
         * Prints out array in a 10x10 grid
         */

        System.out.println("'x' signifies open and '-' signifies closed\n");

        for (int i = 0; i < lockers.length; i++) {

            if (i > 0 && i % 10 == 0)
                System.out.println();
            if (lockers[i] == true)
                System.out.print("x ");

            else
                System.out.print("- ");
        }



    }



}
