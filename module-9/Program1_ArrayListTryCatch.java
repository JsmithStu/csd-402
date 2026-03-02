import java.util.ArrayList;
import java.util.Scanner;

/**
 * Program1_ArrayListTryCatch
 *
 * Uses an ArrayList of Strings (10+ items), prints using a for-each loop,
 * asks the user for an index to view again, and uses try/catch to handle
 * out-of-bounds input. Demonstrates Autoboxing/Unboxing and String input.
 *
 * Author: Johnathan Smith
 * Course: CSD 402
 * Module: 9
 */
public class Program1_ArrayListTryCatch {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();

        
        words.add("Detroit");
        words.add("Java");
        words.add("ArrayList");
        words.add("TryCatch");
        words.add("Coding");
        words.add("Target");
        words.add("HealthCare");
        words.add("Basketball");
        words.add("UnrealEngine");
        words.add("GitHub");

        // Print collection using for-each
        System.out.println("ArrayList items:");
        for (String item : words) {
            System.out.println("- " + item);
        }

        Scanner input = new Scanner(System.in);

        // Working with user's String input
        System.out.print("\nWhich element index would you like to see again? (0 - " + (words.size() - 1) + "): ");
        String userText = input.nextLine(); // string input

        try {
            
            int indexPrimitive = Integer.parseInt(userText);

            
            Integer indexBoxed = indexPrimitive;

            
            int indexUnboxed = indexBoxed;

            
            System.out.println("You chose: " + words.get(indexUnboxed));

        } catch (NumberFormatException e) {
            System.out.println("Exception thrown: Out of Bounds");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception thrown: Out of Bounds");
        }

        input.close();
    }
}