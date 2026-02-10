/**
 * Fan
 *
 * Description:
 * Models a fan with speed, on/off state, radius, and color.
 *
 * Module 6 Requirements Implemented:
 * - Constants: STOPPED=0, SLOW=1, MEDIUM=2, FAST=3
 * - speed default STOPPED
 * - boolean on
 * - radius default 6
 * - color default "white"
 * - getters/setters for mutable fields
 * - no-argument constructor sets default values
 * - argument constructor sets field values
 * - toString() returns a description of the Fan state
 * - uses 'this' reference where allowed
 *
 * Author: Johnathan Smith
 * Course: CSD 402
 * Module: 6 (Base for Module 7)
 */

public class Fan {

    // Constants
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    /**
     * No-argument constructor (defaults)
     */
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6.0;
        this.color = "white";
    }

    /**
     * Argument constructor
     */
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getters
    public int getSpeed() {
        return this.speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    // Setters
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Module 6 required toString()
     * (Module 7 display must NOT use this method.)
     */
    @Override
    public String toString() {
        return "Fan{speed=" + this.speed +
                ", on=" + this.on +
                ", radius=" + this.radius +
                ", color='" + this.color + "'}";
    }
}
