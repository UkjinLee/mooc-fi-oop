package week3;

import java.util.ArrayList;
import java.util.Scanner;

//        Type a word: Mozart
//        Type a word: Schubert
//        Type a word: Bach
//        Type a word: Sibelius
//        Type a word: Liszt
//        Type a word:
//        You typed the following words:
//        Mozart
//        Schubert
//        Bach
//        Sibelius
//        Liszt

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        while(true) {
            System.out.print("Type a word: ");
            String input = reader.nextLine();
            if (input.isEmpty())
                break;
            words.add(input);
        }

        System.out.println("You typed the following words:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
