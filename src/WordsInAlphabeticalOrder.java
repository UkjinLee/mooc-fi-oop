import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//        Type a word: Mozart
//        Type a word: Schubert
//        Type a word: Bach
//        Type a word: Sibelius
//        Type a word: Liszt
//        Type a word:
//        You typed the following words:
//        Bach
//        Liszt
//        Mozart
//        Schubert
//        Sibelius

public class WordsInAlphabeticalOrder {

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

        // todo: sort a word list
        Collections.sort(words);

        System.out.println("You typed the following words:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
