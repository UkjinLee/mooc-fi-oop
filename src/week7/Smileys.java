package week7;

public class Smileys {

    private static void printSmileys(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(":)");
        }
        System.out.println();
    }

    private static void printWithSmileys(String characterString) {
        String outputString = ":) " + characterString;
        if (characterString.length() % 2 == 1)
            outputString += ' ';
        outputString += " :)";

        printSmileys(outputString.length() / 2);
        System.out.println(outputString);
        printSmileys(outputString.length() / 2);
    }

    public static void main(String[] args) {

//        :):):):):)
//        :) \:D/ :)
//        :):):):):)

        printWithSmileys("\\:D/");

//        :):):):):)
//        :) 87.  :)
//        :):):):):)

        printWithSmileys("87.");

//        :):):):):):):):):)
//        :) Hello World  :)
//        :):):):):):):):):)

        printWithSmileys("Hello World");
    }
}
