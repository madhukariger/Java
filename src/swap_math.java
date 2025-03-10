
// Java Program to swap the two values
// without using third variable

// Importing generic Java libraries
import java.util.*;

class swap_math {
    // Function to swap values of two numbers
    // without creating temp variable
    static void swapValuesWithoutUsingThirdVariable(int[] values) {
        // Steps as listed in algorithm
        // Difference of 2nd from 1st
        // is stored in first variable
        values[0] = values[0] - values[1];
        // Sum is stored in second variable
        values[1] = values[0] + values[1];
        // Difference of 1st from 2nd
        // is replaced in first variable
        values[0] = values[1] - values[0];
    }

    // Main driver method
    public static void main(String[] args) {
        // Random numbers of integer type
        int[] values = {9, 5};

        // Above function is called in main
        // to swap values of numbers
        swapValuesWithoutUsingThirdVariable(values);

        // Print swapped values
        System.out.println("Value of m is " + values[0] + " and Value of n is " + values[1]);
    }
}