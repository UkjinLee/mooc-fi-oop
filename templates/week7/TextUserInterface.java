import java.util.Scanner;

public class TextUserInterface {

//    EXERCISE 7.4: THE BEGINNING OF A TEXT USER INTERFACE

    public TextUserInterface(Scanner reader, Dictionary dictionary) {

    }

    //    starts the interface.
    public void start() {

    }

//    EXERCISE 7.5: ADDING AND TRANSLATING WORDS

//    asks for a word pair from the user and adds them to the dictionary.
//    the method add

//    asks a word from the user and it prints the translation.
//    the method translate

//    show the word list
//    the method list


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

        Scanner reader = new Scanner(System.in);
        Dictionary dict = new Dictionary();

        TextUserInterface ui = new TextUserInterface(reader, dict);
        ui.start();


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

//        String input = "translate\n" + "monkey\n"  +
//                "translate\n" + "cheese\n" +
//                "add\n"  + "cheese\n" + "치즈\n" +
//                "translate\n" + "cheese\n" +
//                "quit\n";
//
//        Scanner reader = new Scanner(input);
//        week7.Dictionary dictionary = new week7.Dictionary();
//
//        week7.TextUserInterface ui = new week7.TextUserInterface(reader, dictionary);
//        ui.start();
    }
}
