//Dan Albert Solis
//3/6/2020
//Lists, Stacks & Queues
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

public class PointTest{
    public static void main(String[] args){
        Point[] arr2 = new Point[100]; //Declares and initializes arr2

        for (int i = 0; i < 100; i++){
            arr2[i] =  new Point(Math.random() * 1000,Math.random() * 1000);
        }

        // Sorts and prints points by its X-Value
        System.out.println("SORTED BY X:");
        Arrays.sort(arr2);
        for (Point i: arr2){
            System.out.println("["+i.getX() +"," + i.getY()+"]");
        }
        System.out.println("\nSORTED BY Y:");

        //Sorts and prints points by its Y-Value
        Arrays.sort(arr2, new CompareY());
        for (Point i: arr2){
            System.out.println("["+i.getX() +"," + i.getY()+"]");

        }




    }

}