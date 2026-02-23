import java.util.ArrayList;
import java.util.Scanner;

/**
 * SmithArrayListTest
 *
 * This program collects integer input from the user into an ArrayList<Integer>
 * until the user enters 0 (0 is also stored). It then calls a max method that
 * returns the largest value in the list (or 0 if the list is empty).
 *
 * Author: Johnathan Smith
 * Course: CSD 402
 * Module: 8
 */
public class SmithArrayListTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (enter 0 to stop). 0 will be added to the list too.");

        while (true) {
            System.out.print("Enter an integer: ");
            int value = input.nextInt();
            numbers.add(value); // 0 MUST be added too

            if (value == 0) {
                break;
            }
        }

        Integer largest = max(numbers);
        System.out.println("\nLargest value in the ArrayList: " + largest);

        // Extra testing: empty list test (should return 0)
        ArrayList<Integer> emptyList = new ArrayList<>();
        System.out.println("Largest value in an EMPTY ArrayList: " + max(emptyList));

        // Extra testing: known list test
        ArrayList<Integer> testList = new ArrayList<>();
        testList.add(5);
        testList.add(12);
        testList.add(-3);
        testList.add(0);
        System.out.println("Largest value in test list [5, 12, -3, 0]: " + max(testList));

        input.close();
    }

    /**
     * Returns the largest Integer in the ArrayList.
     * If the ArrayList is empty, returns 0.
     *
     * Required signature: public static Integer max (ArrayList list)
     */
    public static Integer max(ArrayList list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }

        Integer largest = (Integer) list.get(0);

        for (int i = 1; i < list.size(); i++) {
            Integer current = (Integer) list.get(i);
            if (current > largest) {
                largest = current;
            }
        }

        return largest;
    }
}