class RegularPolygon {
    private int n; //defines number of sides in a polygon, default at 3
    private double side; //defines length of a side, default at 1.0
    private double x; //defines the x-coordinate of the polygons center, default at 0.0
    private double y; //defines the y-coordinate of the polygons center, default at 0.0

    /**
     * Default constructor, sets instance variables to default values
     */
    public RegularPolygon(){
        n = 3;
        side = 1.0;
        x = 0.0;
        y = 0.0;
    }

    /**
     * Constructor with defined sides and length of side, user passed in
     * @param n number of sides
     * @param side length of sides
     */
    public RegularPolygon(int n, double side){
        this.n = n;
        this.side = side;
        x = 0.0;
        y = 0.0;
    }

    /**
     * Constructor with defined sides, length, x and y
     * @param n number of sides
     * @param side length of sides
     * @param x x-value
     * @param y y-value
     */
    public RegularPolygon(int n, double side, double x, double y){
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    /** Accessor Methods **/
    public int getN(){
        return n;
    }

    public double getSide(){
        return side;
    }

    public double getX() {
        return x;
    }

    public double getY(){
        return y;
    }

    /** Mutator Methods */
    public void setN(int n){
        n = this.n;

    }
    public void setSide(double side){
        side = this.side;

    }
    public void setX(double x){
        x = this.x;

    }
    public void setY(double y){
        y = this.y;

    }

    /**
     * getPerimeter method
     * @return length of side multiplied by number of sides
     */
    public double getPerimeter(){
        return side * n;
    }

    /**
     * calculates area of polygon
     * @return area
     */
    public double getArea(){
        double area;
        area = ( getN() * Math.pow(getSide(), 2) ) / ( 4 * Math.tan(Math.PI/getN()) );
        return area;
    }


}


public class PolygonTest {
    public static void main (String[] args){
        RegularPolygon p1 = new RegularPolygon();
        RegularPolygon p2 = new RegularPolygon(6, 4);
        RegularPolygon p3  = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("Polygon 1 Area: " + p1.getArea() + " \nPolygon 1 Perimeter: "+ p1.getPerimeter()+"\n");
        System.out.println("Polygon 2 Area: " + p2.getArea() + "\nPolygon 2 Perimeter "+ p2.getPerimeter()+"\n");
        System.out.println("Polygon 3 Area: " + p3.getArea() + "\nPolygon 3 Perimeter "+ p3.getPerimeter()+"\n");
    }


}
