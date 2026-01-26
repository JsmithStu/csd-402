///
 Name: Johnathan Smith
 Course: CSD 402
 Module: 3
 Assignment: Nested For Loops Pattern
///

public class PowerOfTwoPattern {

    public static void main(String[] args) {

        int rows = 7;

        for (int i = 1; i <= rows; i++) {

            // Print leading spaces
            for (int space = rows - i; space > 0; space--) {
                System.out.print("  ");
            }

            // Left side (increasing powers of 2)
            int num = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num *= 2;
            }

            // Right side (decreasing powers of 2)
            num /= 4;
            for (int j = 1; j < i; j++) {
                System.out.print(num + " ");
                num /= 2;
            }

            // End of line symbol
            System.out.println("@");
        }
    }
}
