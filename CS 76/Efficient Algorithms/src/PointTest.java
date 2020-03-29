//Dan Albert Solis
//3/6/2020
//Lists, Stacks & Queues
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * class Point implements Comparable
 */
class Point implements Comparable<Point> {
    private double x,y;

    /**
     * Sets Point object with fields x,y equal to the class
     * @param x
     * @param y
     */
    Point (double x, double y) {
        this.x = x;
        this.y = y;
    }

    //Accessor Methods
    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    /**
     * Compares X value of this class and passed in point
     * @param o
     * @return 1 if this class is bigger, or 0, else check Y
     */
    @Override
    public int compareTo(Point o) {
        if (x > o.x) {
            return 1;
        } else if (this.getX()  < o.getX()) {
            return -1;
        } else if (this.getY() > o.getY()) {
            return 1;
        } else if (this.getY() < o.getY()) {
            return -1;
        } else {
            return 0;
        }
    }
}


/**
 * Class CompareY implements Comparator
 */
class CompareY implements Comparator<Point>, java.io.Serializable {

    /**
     * Compares Y Points of Points o1 and o2
     * @param o1
     * @param o2
     * @return 1 if this class is bigger, or 0, else check Y
     */
    @Override
    public int compare(Point o1, Point o2) {
        if (o1.getY() > o2.getY()) {
            return 1;
        } else if (o1.getY() < o2.getY()) {
            return -1;
        } else if (o1.getX() > o2.getX()) {
            return 1;
        } else if (o1.getX() < o2.getX()) {
            return -1;
        } else {
            return 0;
        }
    }
}

class Pair{

    Point p1, p2;

    public Pair(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    /** Return the distance of the closest pair of points */


    public double getDistance(Point p1, Point p2){

        return Math.sqrt(Math.pow(p2.getX() - p1.getX(),2) + Math.pow(p2.getY() - p1.getY(),2));
    }

    public static Pair getClosestPair(double[][]  points){

        return
    }

    /** Return the distance of the closest pair of points */

    public static Pair getClosestPair(Point [ ]  points){
        for (int i = 0; i < )
    }



}

public class PointTest{
    public static void main(String[] args){
        Point[] arr = new Point[100]; //Declares and initializes S
        Point[] s1 = new Point[arr.length/2]; //S1
        Point[] s2 = new Point[(arr.length/2) - 1];// S2
        ArrayList stripL = new ArrayList<Point>();
        ArrayList stripR = new ArrayList<Point>();
        double midX = arr.length/2;


        for (int i = 0; i < 100; i++){
            arr[i] =  new Point(Math.random() * 1000,Math.random() * 1000);
        }

        // Sorts and prints points by its X-Value
        System.out.println("SORTED BY X:");
        Arrays.sort(arr);
        for (Point i: arr){
            System.out.println("["+i.getX() +"," + i.getY()+"]");
        }
        System.out.println("\nSORTED BY Y:");

        //Sorts and prints points by its Y-Value
        Arrays.sort(arr, new CompareY());
        for (Point i: arr){
            System.out.println("["+i.getX() +"," + i.getY()+"]");

        }

        for (int i = 0; i < arr.length/2;i++){ //S1
            s1[i] = arr[i];
        }
        for (int i = (arr.length/2) + 1; i < arr.length;i++){ //S2
            s2[i] = arr[i];
        }

        for(int i = 0; i < arr.length; i++){ //for each point in s
            for(int j = 0; j < s1.length;j++) { //inside s1
                if((arr[i].equals(s1[j])) && (midX - arr[i].getX() <= d))
                    stripL.add(arr[i]);
            }
            for (int j = 0; j < s2.length;j++){
                if(arr[i].equals(s2[j]))
                    stripR.add(arr[i]);

            }

        }






    }

}