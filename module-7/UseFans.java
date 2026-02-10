import java.util.ArrayList;
import java.util.List;

/**
 * UseFans
 *
 * Description:
 * Tests the Fan class by creating a collection of Fan instances and displaying
 * each Fan without using the toString() method.
 *
 * Module 7 Requirements Implemented:
 * - Create a collection of Fan instances
 * - Create a method taking a collection of Fan instances for displaying WITHOUT toString()
 * - Create a method taking a single Fan instance for displaying WITHOUT toString()
 * - Test code that displays the functionality of all Fan instances in the collection
 *
 * Author: Johnathan Smith
 * Course: CSD 402
 * Module: 7
 */

public class UseFans {

    public static void main(String[] args) {

        // 1) Create a collection of Fan instances
        List<Fan> fans = new ArrayList<>();

        // Fan using default constructor
        Fan fan1 = new Fan();

        // Fan using argument constructor
        Fan fan2 = new Fan(Fan.FAST, true, 10.0, "black");

        // Extra fans to better show the collection
        Fan fan3 = new Fan(Fan.SLOW, true, 7.5, "blue");
        Fan fan4 = new Fan(Fan.MEDIUM, false, 6.0, "white");

        // Add to collection
        fans.add(fan1);
        fans.add(fan2);
        fans.add(fan3);
        fans.add(fan4);

        // 5) Display all Fan instances in the collection
        displayFans(fans);
    }

    /**
     * 2) Display method for a collection of Fans (NO toString usage)
     */
    public static void displayFans(List<Fan> fans) {
        System.out.println("==== Fan Collection Display (No toString) ====\n");

        for (int i = 0; i < fans.size(); i++) {
            System.out.println("Fan #" + (i + 1));
            displayFan(fans.get(i));
            System.out.println();
        }
    }

    /**
     * 3) Display method for a single Fan (NO toString usage)
     */
    public static void displayFan(Fan fan) {
        System.out.println("On: " + fan.isOn());
        System.out.println("Speed: " + speedName(fan.getSpeed()));
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Color: " + fan.getColor());
    }

    /**
     * Helper method to make speed more readable
     */
    private static String speedName(int speed) {
        if (speed == Fan.STOPPED) return "STOPPED (0)";
        if (speed == Fan.SLOW) return "SLOW (1)";
        if (speed == Fan.MEDIUM) return "MEDIUM (2)";
        if (speed == Fan.FAST) return "FAST (3)";
        return "CUSTOM (" + speed + ")";
    }
}
