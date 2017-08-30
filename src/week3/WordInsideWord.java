package week3;

import java.util.Scanner;

//        Type the first word: glitter
//        Type the second word: litter
//        The word 'litter' is found in the word 'glitter'.
//
//        Type the first word: glitter
//        Type the second word: clean
//        The word 'clean' is not found in the word 'glitter'.

public class WordInsideWord {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Type the first word: ");
        String first = reader.nextLine();

        System.out.print("Type the second word: ");
        String second = reader.nextLine();

        System.out.println("The word '" + second + "' is "
                + (first.contains(second) ? "" : "not ")
                + "found in the word '" + first + "'.");
    }
}
