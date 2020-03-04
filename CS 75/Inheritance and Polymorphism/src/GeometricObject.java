// Dan Albert Solis
// 1/28/20
// Abstract Classes and Interfaces

import java.util.*;


public abstract class GeometricObject {
  private String color = "white";
  private boolean filled;
  private Date dateCreated;

  /** Construct a default geometric object */
  protected GeometricObject() {
    dateCreated = new Date();
  }

  /** Construct a geometric object with color and filled value */
  protected GeometricObject(String color, boolean filled) {
    dateCreated = new Date();
    this.color = color;
    this.filled = filled;
  }

  /** Return color */
  public String getColor() {
    return color;
  }

  /** Set a new color */
  public void setColor(String color) {
    this.color = color;
  }

  /** Return filled. Since filled is boolean,
   *  the get method is named isFilled */
  public boolean isFilled() {
    return filled;
  }

  /** Set a new filled */
  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  /** Get dateCreated */
  public Date getDateCreated() {
    return dateCreated;
  }

  /** Return a string representation of this object */
  public String toString() {
    return " created on " + dateCreated + "\ncolor: " + color +
      " and filled: " + filled+"\n";
  }

  /** Abstract method getArea */
  public abstract double getArea();

  /** Abstract method getPerimeter */
  public abstract double getPerimeter();
}

class Rectangle extends GeometricObject {

/** Private instance variable declarations */
  private double width, height;

  /**
   * Default constructor
   */
  public Rectangle(){

  }


  /**
   * Overloaded constructor with user defined width and height
   * @param width
   * @param height
   */
  public Rectangle(double width, double height){
    this.width = width ;
    this.height = height;
  }

  /**
   *  Overloaded constructor with user defined width, height, color, and filled.
   * @param width
   * @param height
   * @param color
   * @param filled
   */
  public Rectangle(double width, double height, String color, boolean filled){
    super(color, filled);
    this.width = width;
    this.height = height;
  }

/** Accessor Methods */
  public double getWidth() {
    return width;
  }

  public double getHeight() {
    return height;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  /**
   * Calculates and returns area of a rectangle
   * @return area
   */
  @Override
  public double getArea() {
    return width * height;
  }

  /**
   * Calculates and returns perimeter of a reactangle
   * @return perimeter
   */
  @Override
  public double getPerimeter() {
    return (2 * width) + (2*height);
  }

  /**
   * toString method returns area and perimeter then supers date created,
   * filled, and color
   * @return String
   */
  public String toString(){
    return "Area: "+getArea()+" Perimeter: "+getPerimeter()+super.toString();
  }
}

class Circle extends GeometricObject {

/** Private instance variables */
  private double radius;

  /**
   * Default constructor
   */
  public Circle(){

  }

  /**
   * Overloaded constructor with user defined radius
   * @param radius
   */
  public Circle(double radius){
    this.radius = radius;
  }

  /**
   * Overloaded constructor with user defined radius, color and filled
   * @param radius
   * @param color
   * @param filled
   */
  public Circle(double radius, String color, boolean filled){
    super(color, filled);
    this.radius = radius;
  }

  /** Accessor Methods */
  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  /**
   * Calculates and returns diameter of a circle
   * @return diameter
   */
  public double getDiameter(){
    return 2 * radius;
  }

  /**
   * Calculates and returns area of a circle
   * @return area of a circle
   */
  @Override
  public double getArea() {
    return Math.PI * Math.pow(radius,2);
  }

  /**
   * Calculates and returns perimeter of a circle
   * @return perimeter
   */
  @Override
  public double getPerimeter() {
    return (2 * Math.PI * radius);
  }

  /**
   * toString method returns diameter, area, and perimeter then supers date created,
   * filled, and color
   * @return String
   */
  public String toString(){
    return "Diameter: "+getDiameter()+ " Area: "+getArea()+" Perimeter: "+getPerimeter()+super.toString();
  }
}

class Triangle extends GeometricObject {

/** Private instance variables */
  private double sideA, sideB, sideC;

  /**
   * Default contructor
   */
  public Triangle(){

  }

  /**
   * Overloaded constructor with user defined sides
   * @param sideA
   * @param sideB
   * @param sideC
   */
  public Triangle(double sideA, double sideB, double sideC){
    this.sideA = sideA;
    this.sideB = sideB;
    this.sideC = sideC;
  }

  /**
   * Overloaded constructor with user defined sides, color, and filled
   * @param sideA
   * @param sideB
   * @param sideC
   * @param color
   * @param filled
   */
  public Triangle(double sideA, double sideB, double sideC, String color, boolean filled){
    super(color, filled);
    this.sideA = sideA;
    this.sideB = sideB;
    this.sideC = sideC;

  }

  /** Accessor methods */
  public void setSideA(double sideA) {
    this.sideA = sideA;
  }

  public void setSideB(double sideB){
    this.sideB = sideB;
  }

  public void setSideC(double sideC){
    this.sideC = sideC;
  }

  /**
   * Calculates and returns area
   * @return area
   */
  @Override
  public double getArea() {
    double p = (sideA + sideB + sideC)/2;
    double area = Math.sqrt(p * (p-sideA)*(p-sideB)*(p-sideC));
    return area;
  }

  /**
   * Calculates and returns perimeter
   * @return perimeter
   */
  @Override
  public double getPerimeter() {
    return sideA + sideB + sideC;
  }

  /**
   * toString method returns area, and perimeter then supers date created,
   * filled, and color
   * @return String
   */
  public String toString(){
    return "Area: "+getArea()+" Perimeter: "+getPerimeter()+super.toString();
  }
}

class geometricDriver{
  public static void main(String[] args) {
    /** Instance Variables */
    String color, object;
    boolean filled, undefined;

    /** Initializations */
    undefined = true;
    Scanner stdin = new Scanner(System.in);

    /**
     * Will continue to ask for geometric object input until user selects exit
     */
    while(undefined){
      System.out.print("Is this object a (C)ircle, (R)ectangle, (T)riangle, or (E)xit?: ");
      object = stdin.next();

      //Circle selection, object is created and printed
      if (object.equalsIgnoreCase("c")){
        double radius;

        System.out.print("Enter the radius of the circle: ");
        radius = stdin.nextDouble();
        System.out.print("What is the color of this object?: ");
        color = stdin.next();
        System.out.print("Is this object filled? (TRUE OR FALSE): ");
        filled = stdin.nextBoolean();



        Circle obj1 = new Circle(radius, color, filled);
        System.out.println(obj1.toString());
      }

      //Rectangle selection, object is created and printed
      else if (object.equalsIgnoreCase("r")){
        double height, width;

        System.out.print("Enter the height of the rectangle: ");
        height = stdin.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        width = stdin.nextDouble();
        System.out.print("What is the color of this object?: ");
        color = stdin.next();
        System.out.print("Is this object filled? (TRUE OR FALSE): ");
        filled = stdin.nextBoolean();



        Rectangle obj1 = new Rectangle(width, height, color, filled);
        System.out.println(obj1.toString());
      }

      //Triangle selection, object is created and printed
      else if (object.equalsIgnoreCase("t")) {
        int sideA, sideB, sideC;

        System.out.print("Enter the first of three sides of the triangle: ");
        sideA = stdin.nextInt();
        System.out.print("Enter the second of three sides of the triangle: ");
        sideB = stdin.nextInt();
        System.out.print("Enter the third of three sides of the triangle: ");
        sideC = stdin.nextInt();
        if ((sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideB + sideC > sideA)) {

          System.out.print("What is the color of this object?: ");
          color = stdin.next();
          System.out.print("Is this object filled? (TRUE OR FALSE): ");
          filled = stdin.nextBoolean();

          Triangle obj1 = new Triangle(sideA, sideB, sideC, color, filled);
          System.out.println(obj1.toString());
        }

        else
          System.out.println("Not a valid triangle!");
      }

      //Exit selection, undefined is set to false and program closes
      else if(object.equalsIgnoreCase("e")){
        undefined = false;
        System.out.println("Closing program");
      }
      //If an unrecognized option is selected, prints out error
      else {
        System.out.println("ERROR: Not a valid selection!");
      }
    }
  }
}

