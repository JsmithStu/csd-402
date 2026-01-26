///
 Name: Johnathan Smith
 Course: CSD 402
 Module: 2.2
 Assignment: Rock-Paper-Scissors
///

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int computer = random.nextInt(3) + 1;

        System.out.print("Enter 1 for Rock, 2 for Paper, or 3 for Scissors: ");
        int user = input.nextInt();

        System.out.println("\nYour choice: " + user);
        System.out.println("Computer choice: " + computer);

        if (user == computer) {
            System.out.println("Result: It's a tie!");
        }
        else if (user == 1 && computer == 3) {
            System.out.println("Result: You win!");
        }
        else if (user == 2 && computer == 1) {
            System.out.println("Result: You win!");
        }
        else if (user == 3 && computer == 2) {
            System.out.println("Result: You win!");
        }
        else {
            System.out.println("Result: You lose!");
        }

        input.close();
    }
}
