package day6.task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Integer array
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Original Integer array: " + Arrays.toString(intArray));
        ArrayUtils.swap(intArray, 1, 3);
        System.out.println("After swapping: " + Arrays.toString(intArray));

        // String array
        String[] stringArray = {"apple", "banana", "orange"};
        System.out.println("Original String array: " + Arrays.toString(stringArray));
        ArrayUtils.swap(stringArray, 0, 2);
        System.out.println("After swapping: " + Arrays.toString(stringArray));
    }
}
