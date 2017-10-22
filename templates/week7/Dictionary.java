import java.util.ArrayList;

public class Dictionary {

//    EXERCISE 7.1: CLASS DICTIONARY

//  returns the translation of its parameter. If the word is unknown, it returns null.
    public String translate(String word) {
        return "";
    }

//  adds a new translation to the dictionary
    public void add(String word, String translation) {

    }


//    EXERCISE 7.2: AMOUNT OF WORDS

//    returns the amount of words in the dictionary
    public int amountOfWords() {
        return -1;
    }

//    EXERCISE 7.3: LISTING ALL WORDS

//    returns strings which stand for a content list of your dictionary in the form key = value.
    public ArrayList<String> translationList() {
        return null;
    }


    public static void main(String[] args) {

//        EXERCISE 7.1: CLASS DICTIONARY

//        monkey
//        null

        Dictionary dictionary = new Dictionary();
        dictionary.add("원숭이", "monkey");
        dictionary.add("야구", "baseball");
        dictionary.add("수영", "swimming");

        System.out.println(dictionary.translate("원숭이"));
        System.out.println(dictionary.translate("축구"));


//        EXERCISE 7.2: AMOUNT OF WORDS

//        2
//        3

//        week7.Dictionary dictionary = new week7.Dictionary();
//        dictionary.add("원숭이", "monkey");
//        dictionary.add("야구", "baseball");
//        System.out.println(dictionary.amountOfWords());
//
//        dictionary.add("수영", "swimming");
//        System.out.println(dictionary.amountOfWords());


//        EXERCISE 7.3: LISTING ALL WORDS

//        수영 = swimming
//        원숭이 = monkey
//        야구 = baseball

//        week7.Dictionary dictionary = new week7.Dictionary();
//        dictionary.add("원숭이", "monkey");
//        dictionary.add("야구", "baseball");
//        dictionary.add("수영", "swimming");
//
//        ArrayList<String> translations = dictionary.translationList();
//        for(String translation: translations) {
//            System.out.println(translation);
//        }
    }
}
