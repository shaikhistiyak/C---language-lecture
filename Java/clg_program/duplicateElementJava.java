package Java.clg_program;

import java.util.HashSet;
import java.util.Set;

public class duplicateElementJava {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 5, 6, 7, 7, 2, 2, 2, 2, 2 };

        Set<Integer> seenElement = new HashSet<Integer>();
        Set<Integer> DuplicateElement = new HashSet<Integer>();

        for (int i : arr) {
            if (!seenElement.add(i)) {
                DuplicateElement.add(i);
            }
        }

        for (int d : DuplicateElement) {
            System.out.println("Duplicate Element: " + d);
        }

    }
}
