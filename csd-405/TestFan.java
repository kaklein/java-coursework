/* Katie Klein
 * CSD 405
 * 5 June 2021
 * Assignment 1: Fan Class
 */

/*
 * This program creates a class called Fan which has the attributes speed, on
 * (an on/off boolean), radius, and color. It also includes getter and setter
 * methods. The main method instantiates two Fan objects and demonstrates the
 * functionality of the Fan class' methods.
 */

public class TestFan {
    public static void main(String[] args) {
        /* Create two test instances of Fan class */
        Fan defaultFan = new Fan(); //uses default constructor
        Fan argFan = new Fan(true, 2, 3.5, "blue"); //uses constructor with arguments

        /* Test functionality of Fan class methods */
        // Display description of fans' starting states (returnInfo method)
        System.out.println("\nDESCRIPTION OF FANS' STATES");
        System.out.println("\n" + defaultFan.returnInfo());
        System.out.println("\n" + argFan.returnInfo());

        // Test setters/getters on defaultFan
        System.out.println("\nUPDATES TO " + defaultFan.toString());
        
        System.out.println("> Setting speed to 3...");
        defaultFan.setSpeed(3); //test setSpeed
        System.out.println("New speed: " + defaultFan.getSpeed()); //test getSpeed

        System.out.println("> Setting color to purple...");
        defaultFan.setColor("purple"); //test setColor
        System.out.println("New color: " + defaultFan.getColor()); //test getColor

        // Test setters/getters on argFan
        System.out.println("\nUPDATES TO " + argFan.toString());

        System.out.println("> Setting radius to 22.7...");
        argFan.setRadius(22.7); //test setRadius
        System.out.println("New radius: " + argFan.getRadius()); //test getRadius

        System.out.println("> Setting on status to false...");
        argFan.setOnStatus(false); //test setOnStatus
        System.out.println("New on status: " + argFan.getOnStatus()); //test getOnStatus

        // Display updated description of fan's states (returnInfo method)
        System.out.println("\nUPDATED DESCRIPTION OF FANS' STATES");
        System.out.println("\n" + defaultFan.returnInfo());
        System.out.println("\n" + argFan.returnInfo());

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

