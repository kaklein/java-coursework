/* Katie Klein
 * CSD 405
 * 10 June 2021
 * Assignment 2: Adding a UseFans Class
 */

/*
 * This program builds off of the previous TestFan program. The added UseFans
 * class includes methods to display a collection of Fan objects and a single
 * instance of a Fan object from a collection.
 * 
 * The main class creates a collection of Fan objects and tests these new
 * methods, and also tests the old Fan methods on instances from the collection.
 */

public class TestFan_02 {
    public static void main(String[] args) {
        // create constant to represent # of fans in the collection
        final int NUMBER_OF_FANS = 4;

        // create array of colors
        String[] colors = {"purple", "blue", "red", "yellow", "pink", "orange", "green", "black", "white", "gray"};

        // create collection of Fan objects
        Fan[] newCollection = new Fan[NUMBER_OF_FANS];

        // initialize Fan objects into newCollection
        for (int i = 0; i < newCollection.length; i++) {
            newCollection[i] = new Fan(false, 0, i + 6, colors[i]); // fans in collection are off, stopped, and have unique radius and color
        }

        // Display all objects in collection (UseFans method)
        UseFans.displayCollection(newCollection);

        // Test attribute updates on specific instances
        System.out.println("\nUPDATING INSTANCE ATTRIBUTES\n---------------------------------\n"); // print header line

        System.out.println("Changing Fan 0 speed to 3...\n"); // Fan 0 speed >> 3
        newCollection[0].setSpeed(3);

        System.out.println("Changing Fan 1 radius to 7.5...\n"); // Fan 1 radius >> 7.5
        newCollection[1].setRadius(7.5);

        System.out.println("Changing Fan 2 color to turquoise...\n"); // Fan 2 color >> turquoise
        newCollection[2].setColor("turquoise");

        System.out.println("Changing Fan 3 status to on...\n"); // Fan 3 on >> true
        newCollection[3].setOnStatus(true);

        // Display single objects one at a time in collection (with updated attributes)
        for (int i = 0; i < newCollection.length; i++) {
            UseFans.displaySingleInstance(newCollection, newCollection[i]);
        }

    }
}


class UseFans {
/* This class contains methods for displaying collection of Fans or instances from a collection */

    // Collection display method
    static void displayCollection(Fan[] fanCollection) {
        System.out.println("\nDISPLAYING FULL COLLECTION\n---------------------------------\n"); // print header line
        
        for (int i = 0; i < fanCollection.length; i++) { // iterate through collection and print attributes
            System.out.println("  Fan " + i + ":");
            System.out.println("    On: " + fanCollection[i].getOnStatus());
            System.out.println("    Speed: " + fanCollection[i].getSpeed());
            System.out.println("    Radius: " + fanCollection[i].getRadius());
            System.out.println("    Color: " + fanCollection[i].getColor() + "\n");
        }
    }

    // Single instance display method
    static void displaySingleInstance(Fan[] fanCollection, Fan singleFan) {
        System.out.println("\nDISPLAYING SINGLE INSTANCE\n---------------------------------"); // print header line
        
        int fanNumber = -1;
        for (int i = 0; i < fanCollection.length; i++) { // iterate through collection to find number of fan
            if (singleFan == fanCollection[i]) {
                fanNumber = i;
                break;
            }
        }
        
        System.out.println("  Fan " + fanNumber + ":"); // print attributes of single fan
        System.out.println("    On: " + singleFan.getOnStatus());
        System.out.println("    Speed: " + singleFan.getSpeed());
        System.out.println("    Radius: " + singleFan.getRadius());
        System.out.println("    Color: " + singleFan.getColor() + "\n");
    }
}


class Fan {
    // fan speed constants
    final int STOPPED = 0;
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    // private variables
    private int speed;
    private Boolean on;
    private double radius;
    private String color;

    /* CONSTRUCTORS */
    // no-arg constructor (default values)
    Fan() {
        speed = STOPPED;
        on = false;
        radius = 6;
        color = "white";
    }

    // constructor with arguments
    Fan(Boolean on, int speed, double radius, String color) {
        this.on = on;
        this.speed = speed;
        this.radius = radius;
        this.color = color;
    }

    /* METHODS */
    Boolean getOnStatus() { //get fan status (on or off)
        return on;
    }

    void setOnStatus(Boolean on) { //set fan status (on or off)
        this.on = on;
    }
    
    int getSpeed() { //get fan speed
        return speed;
    }

    void setSpeed(int speed) { //set fan speed
        this.speed = speed;
    }

    double getRadius() { //get fan radius
        return radius;
    }

    void setRadius(double radius) { //set fan radius
        this.radius = radius;
    }

    String getColor() { //get fan color
        return color;
    }

    void setColor(String color) { //set fan color
        this.color = color;
    }

    // method to return description of fan state
    String returnInfo() {
        String info = 
            this.toString() +
            "\n\tOn: " + this.getOnStatus() +
            "\n\tSpeed: " + this.getSpeed() +
            "\n\tRadius: " + this.getRadius() +
            "\n\tColor: " + this.getColor();
        return info;
    }
}

