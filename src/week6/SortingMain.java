package week6;

import java.util.Arrays;

public class SortingMain {

    public static void main(String[] args) {

//        EXERCISE 104.1: SMALLEST
//
//        smallest: 5
//
//        int[] values = {6, 5, 8, 7, 11};
//        System.out.println("smallest: " + smallest(values));


//        EXERCISE 104.2: THE INDEX OF THE SMALLEST
//
//        Index of the smallest: 1
//
//        int[] values = {6, 5, 8, 7, 11};
//        System.out.println("Index of the smallest: " + indexOfTheSmallest(values));


//        EXERCISE 104.3: INDEX OF THE SMALLEST AT THE END OF AN ARRAY
//
//        1
//        3
//        4
//
//        int[] values = {-1, 6, 9, 8, 12};
//        System.out.println(indexOfTheSmallestStartingFrom(values, 1));
//        System.out.println(indexOfTheSmallestStartingFrom(values, 2));
//        System.out.println(indexOfTheSmallestStartingFrom(values, 4));


//        EXERCISE 104.4: SWAPPING VALUES
//
//        [3, 2, 5, 4, 8]
//        [2, 3, 5, 4, 8]
//        [4, 3, 5, 2, 8]
//
//        int[] values = {3, 2, 5, 4, 8};
//
//        System.out.println( Arrays.toString(values) );
//
//        swap(values, 1, 0);
//        System.out.println( Arrays.toString(values) );
//
//        swap(values, 0, 3);
//        System.out.println( Arrays.toString(values) );


//        EXERCISE 104.5: SORTING
//
//        [8, 3, 7, 9, 1, 2, 4]
//        [1, 3, 7, 9, 8, 2, 4]
//        [1, 2, 7, 9, 8, 3, 4]
//        [1, 2, 3, 9, 8, 7, 4]
//        [1, 2, 3, 4, 8, 7, 9]
//        [1, 2, 3, 4, 7, 8, 9]
//        [1, 2, 3, 4, 7, 8, 9]
//
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest)
                smallest = array[i];
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index])
                index = i;
        }
        return index;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        return index + indexOfTheSmallest(Arrays.copyOfRange(array, index, array.length));
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            int smallest = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, smallest);
            System.out.println(Arrays.toString(array));
        }
    }
}
