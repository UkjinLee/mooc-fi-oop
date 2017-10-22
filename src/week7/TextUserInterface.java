package week7;

import java.util.ArrayList;
import java.util.Scanner;

public class TextUserInterface {

//    EXERCISE 7.4: THE BEGINNING OF A TEXT USER INTERFACE

    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

//    starts the interface.
    public void start() {
        System.out.println("Statements:");
        System.out.println("add - adds a word pair to the dictionary");
        System.out.println("translate - asks a word and prints its translation");
        System.out.println("quit - quits the text user interface");
        System.out.println("list - show the word list");

        while (true) {
            System.out.println();
            System.out.print("Statement: ");
            String command = reader.nextLine();
            if (command.equals("quit"))
                break;
            if (command.equals("add")) {
                add();
            } else if (command.equals("translate")) {
                translate();
            } else if (command.equals("list")) {
                list();
            } else {
                System.out.println("Unknown statement");
            }
        }

        System.out.println("Cheers!");
    }

//    EXERCISE 7.5: ADDING AND TRANSLATING WORDS

//    asks for a word pair from the user and adds them to the dictionary.
//    the method add
    public void add() {
//        In Korean: 당근
//        Translation: carrot
        System.out.print("In Korean: ");
        String korean = reader.nextLine();
        System.out.print("Translation: ");
        String english = reader.nextLine();
        dictionary.add(korean, english);
    }

//    asks a word from the user and it prints the translation.
//    the method translate
    private void translate() {
//        Give a word: 당근
//        Translation: carrot
        System.out.print("Give a word: ");
        String korean = reader.nextLine();
        String translated = dictionary.translate(korean);
        if (translated != null) {
            System.out.println("Translation: " + translated);
        } else {
            System.out.println("Unknown word!");
        }
    }

//    show the word list
//    the method list
    private void list() {
//        당근 = carrot
//        야구 = baseball
//        Total Words: 2
        ArrayList<String> translations = dictionary.translationList();
        for(String translation: translations) {
            System.out.println(translation);
        }
        System.out.println("Total Words: " + dictionary.amountOfWords());
    }


    public static void main(String[] args) {

//        EXERCISE 7.4: THE BEGINNING OF A TEXT USER INTERFACE

//        Statements:
//        quit - quits the text user interface
//
//        Statement: help
//        Unknown statement
//
//        Statement: quit
//        Cheers!

//        Scanner reader = new Scanner(System.in);
//        week7.Dictionary dict = new week7.Dictionary();
//
//        week7.TextUserInterface ui = new week7.TextUserInterface(reader, dict);
//        ui.start();


//        EXERCISE 7.5: ADDING AND TRANSLATING WORDS

//        Statements:
//        add - adds a word pair to the dictionary
//        translate - asks a word and prints its translation
//        quit - quits the text user interface
//        list - show the word list
//
//        Statement: add
//        In Korean: 당근
//        Translation: carrot
//
//        Statement: translate
//        Give a word: 당근
//        Translation: carrot
//
//        Statement: add
//        In Korean: 야구
//        Translation: baseball
//
//        Statement: list
//        당근 = carrot
//        야구 = baseball
//        Total Words: 2
//
//        Statement: quit
//        Cheers!

//        Scanner reader = new Scanner(System.in);
//        week7.Dictionary dict = new week7.Dictionary();
//
//        week7.TextUserInterface ui = new week7.TextUserInterface(reader, dict);
//        ui.start();


//        37. TOWARDS AUTOMATIC TESTS

//        Statements:
//        add - adds a word pair to the dictionary
//        translate - asks a word and prints its translation
//        quit - quits the text user interface
//        list - show the word list
//
//        Statement: Give a word: Unknown word!
//
//        Statement: Give a word: Unknown word!
//
//        Statement: In Korean: Translation:
//        Statement: Give a word: Translation: 치즈
//
//        Statement: Cheers!

        String input = "translate\n" + "monkey\n"  +
                "translate\n" + "cheese\n" +
                "add\n"  + "cheese\n" + "치즈\n" +
                "translate\n" + "cheese\n" +
                "quit\n";

        Scanner reader = new Scanner(input);
        Dictionary dictionary = new Dictionary();

        TextUserInterface ui = new TextUserInterface(reader, dictionary);
        ui.start();
    }
}
