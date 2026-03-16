package Java.array;

import java.util.Arrays;

public class basic {
    public static void main(String[] args) {
        // datatype[] arrayName = new datatype[size];
        // datatype[] arrayname = new datatype[]{value1,value2....};

        String[] names = new String[] { "istiyak", "Tejas", "Jeet", "Manisha", "ayush" };
        // System.out.println(Arrays.toString(names));

        for (int i = 0; i < names.length; i++) {
            System.out.println(i + " index value: " + names[i]);
        }

        for (String n : names) {
            System.out.println(n);
        }

        int[] id = new int[] { 45, 4, 1, 574, 54, 415, 465, 47 };

        Arrays.sort(id);
        System.out.println(Arrays.toString(id));
        Arrays.parallelSort(id);
        System.out.println(Arrays.toString(id));

        int found = Arrays.binarySearch(id, 4);

        if (found > 0) {
            System.out.println("found at index " + found);
        } else {

            System.out.println("not found");
        }

        int[] num1 = new int[] { 2, 3, 1 };
        int[] num2 = new int[] { 2, 3, 5 };
        // System.out.println(num1);
        // System.out.println(num2);
        // if (num1==num2) {
        // System.out.println("both are equal");
        // }
        // else{

        // System.out.println("both are not equal");
        // }

        boolean same = Arrays.equals(num1, num2);
        if (same) {
            System.out.println("both are equal");
        } else {

            System.out.println("both are not equal");
        }

        int com = Arrays.compare(num1, num2);
        System.out.println(com);

        int mismatch = Arrays.mismatch(num1, num2);
        System.out.println(mismatch);

        int[][] num11 = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] num12 = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };

        same = Arrays.deepEquals(num11, num12);
        if (same) {
            System.out.println("both are equal");
        } else {

            System.out.println("both are not equal");
        }

        int[] arr = new int[6];
        // Arrays.fill(arr, 0, 3, 5);
        Arrays.fill(arr, 9);
        System.out.println(Arrays.toString(arr));

        int[] mainarr = new int[] { 98, 45, 47, 89 };
        // int[] copy = mainarr;
        int[] copy = new int[9];
        // copy = mainarr;
        copy = Arrays.copyOf(mainarr,copy.length);
        System.out.println(Arrays.toString(copy));
    }
}
