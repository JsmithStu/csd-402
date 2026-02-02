/**
 * SingleDimensionalArrays
 *
 * This program demonstrates the use of single-dimensional arrays
 * and overloaded methods to calculate the average of different
 * numeric array types.
 *
 * Author: Johnathan Smith
 * Course: CSD 402
 * Module: 4
 */


public class SingleDimensionalArrays {


    // Average of short array
    public static short average(short[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return (short)(sum / array.length);
    }

    // Average of int array
    public static int average(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum / array.length;
    }

    // Average of long array
    public static long average(long[] array) {
        long sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum / array.length;
    }

    // Average of double array
    public static double average(double[] array) {
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum / array.length;
    }

    public static void main(String[] args) {

        short[] shortArray = {5, 10, 15};
        int[] intArray = {10, 20, 30, 40};
        long[] longArray = {100, 200, 300, 400, 500};
        double[] doubleArray = {2.5, 4.5, 6.5, 8.5, 10.5, 12.5};

        System.out.println("Short Array:");
        for (int i = 0; i < shortArray.length; i++) {
            System.out.print(shortArray[i] + " ");
        }
        System.out.println("\nAverage: " + average(shortArray));
        System.out.println();

        System.out.println("Int Array:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println("\nAverage: " + average(intArray));
        System.out.println();

        System.out.println("Long Array:");
        for (int i = 0; i < longArray.length; i++) {
            System.out.print(longArray[i] + " ");
        }
        System.out.println("\nAverage: " + average(longArray));
        System.out.println();

        System.out.println("Double Array:");
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.print(doubleArray[i] + " ");
        }
        System.out.println("\nAverage: " + average(doubleArray));
    }
}
