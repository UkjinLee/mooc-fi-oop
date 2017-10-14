import java.util.ArrayList;
import java.util.Scanner;

import static com.sun.tools.attach.VirtualMachine.list;

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
        System.out.println("Translation: " + dictionary.translate(korean));
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
//        Dictionary dict = new Dictionary();
//
//        TextUserInterface ui = new TextUserInterface(reader, dict);
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

        Scanner reader = new Scanner(System.in);
        Dictionary dict = new Dictionary();

        TextUserInterface ui = new TextUserInterface(reader, dict);
        ui.start();
    }
}
