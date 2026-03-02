import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * Program2_FileRandomNumbers
 *
 * Creates a file named data.file if it doesn't exist.
 * Appends 10 randomly generated integers separated by spaces.
 * Then reopens the file, reads all data, and displays it.
 *
 * Author: Johnathan Smith
 * Course: CSD 402
 * Module: 9
 */
public class Program2_FileRandomNumbers {

    public static void main(String[] args) {
        File file = new File("data.file");
        Random rand = new Random();

        // Create file if it does not exist
        try {
            if (file.createNewFile()) {
                System.out.println("Created new file: " + file.getName());
            } else {
                System.out.println("File already exists: " + file.getName());
            }
        } catch (IOException e) {
            System.out.println("Error creating file.");
            return;
        }

        // Append 10 random integers separated by spaces
        try (FileWriter writer = new FileWriter(file, true)) {
            for (int i = 0; i < 10; i++) {
                int num = rand.nextInt(100); // 0-99 (you can change range)
                writer.write(num + " ");
            }
            writer.write(System.lineSeparator()); // new line after each run
            System.out.println("Appended 10 random numbers to data.file.");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
            return;
        }

        // Reopen file, read data, and display it
        System.out.println("\nFile contents:");
        try (Scanner fileReader = new Scanner(file)) {
            while (fileReader.hasNextLine()) {
                System.out.println(fileReader.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}