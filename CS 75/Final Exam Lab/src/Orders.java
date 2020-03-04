//Dan Albert Solis
//COMSC 075 Final Exam Lab - Fall 2019
//12/18/2019

public class Orders {
    public static void main(String[] args){

        /*
        Instance Variables
         */
        int shirtCount = 0;
        int pantsCount = 0;
        double netShirtPurchase = 0;
        double netPantsPurchase = 0;
        int netWaist = 0;
        int netInseam = 0;
        Clothing[] orders = new Clothing [6];   //array of Clothing objects called orders

        /**
         * Orders indexing from 0 -> 5 that create new objects (shirt/pants) with given attributes
         */
        orders[0] = new Shirt(8,"Green","XXL");
        orders[1] = new Pants(7,"Brown",48,30);
        orders[2] = new Shirt(2,"White","M");
        orders[3] = new Pants(4,"Blue",36,34);
        orders[4] = new Pants(3,"Black",32,31);
        orders[5] = new Shirt(5,"Purple","L");

        /**
         * for-loop that iterates through array of orders and checks what class the object
         * is an instance of and does the calculations according to the item
         */
        for (int i = 0; i < orders.length; i++){
            if (orders[i] instanceof Shirt){
                shirtCount += orders[i].getQuantity();
                netShirtPurchase += orders[i].calculatePrice() * orders[i].getQuantity();
            }
            else if (orders[i] instanceof Pants){
                pantsCount+= orders[i].getQuantity();
                netPantsPurchase += orders[i].calculatePrice() * orders[i].getQuantity();
                netInseam += ((Pants)orders[i]).getInseam() * orders[i].getQuantity();
                netWaist += ((Pants)orders[i]).getWaist() * orders[i].getQuantity();
            }
        }

        double averageInseam = netInseam / (double) pantsCount;
        double averageWaist = netWaist / (double) pantsCount;

        /**
         * Prints out total amt of ordered: shirts, shirt revenue, pants, pants revenue, avg waist size
         * and avg inseam length.
         */
        System.out.println("Total number of shirts ordered: " + shirtCount);
        System.out.printf("Total purchase price of shirts: $%.2f%n",netShirtPurchase);
        System.out.println("Total number of pants ordered: " + pantsCount);
        System.out.printf("Total purchase price of pants: $%.2f%n",netPantsPurchase);
        System.out.printf("Average waist size: %.1f%n",averageWaist);
        System.out.printf("Average inseam length: %.1f%n",averageInseam);

    }
}

/**
 * Clothing class with private attributes quantity and color
 */
class Clothing {
    private int quantity;
    private String color;

    /**
     * default constructor, sets quantity to 0, color to empty string
     */
    public Clothing() {
        quantity = 0;
        color = "";
    }

    /**
     * overloaded constructor with passed in quantity, and color
     * @param quantity of pieces
     * @param color of item
     */
    public Clothing(int quantity, String color) {
        this.quantity = Math.abs(quantity);
        this.color = color;
    }

    /**
     * retrieves quantity of class
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * sets quantity variable to passed in int
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * retrieves color of class
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * sets color variable to passed in string
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * calculates price
     * @return 0
     */
    public double calculatePrice(){
        return 0.0;
    }
}

/**
 * Shirt class is a subclass of Clothing,
 *  inherits attributes
 */
class Shirt extends Clothing{
    private String size;

    /**
     * Default constructor, inherits attributes of superclass
     * sets size to empty string
     */
    public Shirt(){
        super();
        size = "";
    }

    /**
     * overloaded constructor inherits attributes of superclass
     * sets size to to passed in value
     * @param quantity
     * @param color
     * @param size
     */
    public Shirt(int quantity, String color, String size){
        super(quantity, color);
        this.size = size;
    }

    /**
     * retrieves size of item
     * @return size
     */
    public String getSize() {
        return size;
    }

    /**
     * sets size of item from passed in string
     * @param size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * calculates price according to size
     * @return price of item
     */
    @Override
    public double calculatePrice(){
        if (size.equals("S"))
            return 11.00;
        else if(size.equals("M"))
            return 12.50;
        else if(size.equals("L"))
            return 15.00;
        else if(size.equals("XL"))
            return 16.50;
        else
            return 18.50;
    }
}

/**
 * Pants class is a subclass of Clothing
 * has private int attributes waist, inseam
 */
class Pants extends Clothing{
    private int waist, inseam;

    /**
     * Default constructor inherits attributes of superclass
     * sets waist and inseam to 0
     */
    public Pants(){
        super();
        waist = 0;
        inseam = 0;
    }

    /**
     * Overloaded constructor inherits quantity, color from superclass
     * sets waist and inseam from passed in values
     * @param quantity
     * @param color
     * @param waist
     * @param inseam
     */
    public Pants(int quantity, String color, int waist, int inseam){
        super(quantity, color);
        this.waist = waist;
        this.inseam = inseam;
    }

    /**
     * retrieves waist int
     * @return waist int
     */
    public int getWaist() {
        return waist;
    }

    /**
     * sets waist from passed in int
     * @param waist
     */
    public void setWaist(int waist) {
        this.waist = waist;
    }

    /**
     * retrieves inseam
     * @return int
     */
    public int getInseam() {
        return inseam;
    }

    /**
     * sets inseam to passed in int
     * @param inseam
     */
    public void setInseam(int inseam) {
        this.inseam = inseam;
    }

    /**
     * returns price of pants depending on waist and inseam of pants
     * @return int value
     */
    @Override
    public double calculatePrice() {
        if (waist > 46 || inseam > 36)
            return 65.50;
        return 50.00;
    }
}
