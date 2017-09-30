package week6;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchMain {

//    Values of the array: [-3, 2, 3, 4, 7, 8, 12]
//    Enter searcher number: 8
//    Value 8 is in the array
//
//    Values of the array: [-3, 2, 3, 4, 7, 8, 12]
//    Enter searcher number: 99
//    Value 99 is not in the array

    public static void main(String[] args) {
        // Here you can test binary search
        int[] array = { -3, 2, 3, 4, 7, 8, 12 };
        Scanner reader = new Scanner(System.in);

        System.out.print("Values of the array: " + Arrays.toString(array));
        System.out.println();

        System.out.print("Enter searched number: ");
        String searchedValue = reader.nextLine();
        System.out.println();

        boolean result = BinarySearch.search(array, Integer.parseInt(searchedValue));

        // Print the binary search result here
        System.out.println("Value "+ searchedValue + " is " + (result ? "" : "not ") + "in the array");
    }
}
