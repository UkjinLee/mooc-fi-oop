package week3;

import java.util.Scanner;

//        Type a word: example
//        Length of the first part: 4
//        Result: exam
//
//        Type a word: example
//        Length of the first part: 6
//        Result: exampl

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a word: ");
        String word = reader.nextLine();

        System.out.print("Length of the first part: ");
        int length = reader.nextInt();

        System.out.print("Result: " + word.substring(0, length));
    }
}
