// Johnathan Smith
// 1/16/2026
// Module 1.3
import java.util.Scanner;

public class WaterHeatingCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for water mass in kilograms
        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = scanner.nextDouble();

        // Prompt for initial temperature in Celsius
        System.out.print("Enter the initial temperature of water (°C): ");
        double initialTemperature = scanner.nextDouble();

        // Prompt for final temperature in Celsius
        System.out.print("Enter the final temperature of water (°C): ");
        double finalTemperature = scanner.nextDouble();

        // Calculate the energy needed in Joules
        double Q = waterMass * (finalTemperature - initialTemperature) * 4184;

        // Output the result
        System.out.println("The amount of energy needed to heat the water is: " + Q + " Joules");

        scanner.close();
    }
}