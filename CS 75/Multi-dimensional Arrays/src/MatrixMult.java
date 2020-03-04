/**
 * Student: Dan Albert Solis
 * Multi-dimensional Arrays
 * Program multiplies matrix "a" by matrix "b", checks to see if compatible, if values, are valid, and will print and display them.
 */

import java.util.*;

public class MatrixMult {

    private static int aRow,aCol,bRow,bCol;

    public static void main (String[] args){
        Scanner stdin = new Scanner (System.in);

        // First user-inputted matrix
        System.out.println("Matrix A");
        System.out.print("Enter number of rows: ");
        aRow = stdin.nextInt();

        System.out.print("Enter number of columns: ");
        aCol = stdin.nextInt();

        double [][] a = new double [aRow][aCol]; //Declares and intializes first array using user-input rows & cols

        System.out.print("Enter contents by rows: ");
        for (int row = 0; row < a.length; row++) {  //Nested for-loops iterate through array "a" and sets each value per user-input
            for (int col = 0; col < a[row].length; col++) {
                if(stdin.hasNextDouble())   //Checks if the value is valid and will insert it into array, if not it will display an error and exit the program
                    a[row][col] = stdin.nextDouble();
                else {
                    System.out.println("ERROR: Value not containing a valid type detected, please use doubles or integers");
                    System.exit(1);
                }
            }
        }

        //Second user-input matrix
        System.out.println("Matrix B");
        System.out.print("Enter number of rows: ");
        bRow = stdin.nextInt();

        System.out.print("Enter number of columns: ");
        bCol = stdin.nextInt();

        double [][] b = new double [bRow][bCol];     //Declares and intializes second array using user-input rows & cols

        System.out.print("Enter contents by rows: ");
        for (int row = 0; row < b.length; row++) {  //Nested for-loops iterate through array "b" and sets each value per user-input
            for (int col = 0; col < b[row].length; col++) {
                if(stdin.hasNextDouble())
                    b[row][col] = stdin.nextDouble();   //Checks if the value is valid and will insert it into array, if not it will display an error and exit the program
                else {
                    System.out.println("ERROR: Value not containing a valid type detected, please use doubles or integers");
                    System.exit(1);
                }
            }
        }


        if (aCol == bRow)   //Checks if the two matrices are compatible to me multiplied together and if not, will display an error.
            printArray(multiplyMatrix(a,b));
        else
            System.out.println("ERROR: Array A columns is not equal to Array B rows!");
    }

    /**
     * multiplyMatrix method takes in two 2-d double arrays and multiplies the matrices by each other
     * @param a first matrix
     * @param b second matrix
     * @return multiplied matrix from matrix a & b
     */
    public static double[][] multiplyMatrix(double [][] a, double [][] b){

        // Local Variable intializations
        boolean isCalculated = false;
        int current1 = 0;
        int current2 = 0;
        int aRowCurrent = 0;
        int bColumnCurrent = 0;
        double sum = 0;
        double[][] c = new double [aRow][bCol];

        while (!isCalculated){ //Checks if calculations are finished
            for (int cRow = 0; cRow < c.length; cRow++){    //nested-for loop iterating through matrix c
                for (int cCol = 0; cCol < c[0].length ;cCol++){
                    while (current2 < b.length && bColumnCurrent < b[0].length) { //calculates and inserts value to matrix c and if current reaches the end of a row/col, resets
                        sum += a[aRowCurrent][current1++] * b[current2++][bColumnCurrent];
                        c[cRow][cCol] = sum;
                    }
                    sum = 0;
                    current2 = 0;
                    current1 = 0;
                    bColumnCurrent++;
                }
                aRowCurrent++;
                bColumnCurrent = 0;
            }

            isCalculated = true; //Once matrix c is completed, set to true and calculations stop.
        }

        return c;

    }

    /**
     * printArray method that prints array, takes in one parameter and returns nothing
     * @param c is the passed in double array arguement
     */
    public static void printArray(double[][] c){
        System.out.println("Matrix C is");

        for (int cRow = 0; cRow < c.length; cRow++) {
            for (int cCol = 0; cCol < c[cRow].length; cCol++) {
                System.out.print(c[cRow][cCol] + " ");
            }
            System.out.println();
        }
    }



