package Java.clg_program;

import java.util.Arrays;

public class FindDuplicatesSorting {
    public static void main(String[] args) {
        int[] myArray = { 1, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 5, 6, 7, 7, 2, 2, 2, 2, 2 };
        Arrays.sort(myArray); // Sort the array

        System.out.println("Duplicate Elements (using sorting):");
        for (int i = 0; i < myArray.length - 1; i++) {
            if (myArray[i] == myArray[i + 1]) {
                // Check a lookahead condition to avoid printing the same duplicate multiple
                // times in one sequence
                if (i == 0 || myArray[i] != myArray[i - 1]) {
                    System.out.println(myArray[i]);
                }
            }
        }
    }
}
