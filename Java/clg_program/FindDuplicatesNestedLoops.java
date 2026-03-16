package Java.clg_program;

public class FindDuplicatesNestedLoops {
    public static void main(String[] args) {
        int[] myArray = { 1, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 5, 6, 7, 7, 2, 2, 2, 2, 2 };

        System.out.println("Duplicate Elements:");
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] == myArray[j]) {
                    System.out.println(myArray[j]);
                    // Optional: add a mechanism to print each duplicate only once
                }
            }
        }
    }
}
