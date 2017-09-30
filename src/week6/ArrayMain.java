package week6;

import java.util.Arrays;

public class ArrayMain {
    
    public static void main(String[] args) {

//        EXERCISE 98.1: COPY
                
//        original: [1, 2, 3, 4]
//        copied: [99, 2, 3, 4]
        
//        int[] original = {1, 2, 3, 4};
//        int[] copied = copy(original);
//
//        // change the copied
//        copied[0] = 99;
//
//        // print both
//        System.out.println( "original: " + Arrays.toString(original));
//        System.out.println( "copied: " + Arrays.toString(copied));


//        EXERCISE 98.2: REVERSE COPY

//        original: [1, 2, 3, 4]
//        reversed: [4, 3, 2, 1]

        int[] original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println( "original: " +Arrays.toString(original));
        System.out.println( "reversed: " +Arrays.toString(reverse));
    }


    //        EXERCISE 98.1: COPY
    private static int[] copy(int[] original) {
        return original.clone();
    }


    //        EXERCISE 98.2: REVERSE COPY
    private static int[] reverseCopy(int[] original) {
        int[] reverse = new int[original.length];
        for (int i = original.length - 1; i >= 0; i--) {
            reverse[original.length - 1 - i] = original[i];
        }
        return reverse;
    }
}
