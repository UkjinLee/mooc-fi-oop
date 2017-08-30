package week3;

import java.util.ArrayList;
import java.util.Scanner;

//        Type a word: carrot
//        Type a word: celery
//        Type a word: turnip
//        Type a word: rutabaga
//        Type a word: celery
//        You gave the word celery twice

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList 
        ArrayList<String> words = new ArrayList<>();

        String input;
        while(true) {
            System.out.print("Type a word: ");
            input = reader.nextLine();
            if (words.contains(input))
                break;
            words.add(input);
        }

        System.out.println("You gave the word " + input + " twice");
    }
}
