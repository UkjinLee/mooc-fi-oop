import java.util.Scanner;

//        Type a word: example
//        Length of the end part: 4
//        Result: mple
//
//        Type a word: example
//        Length of the end part: 6
//        Result: xample


public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a word: ");
        String word = reader.nextLine();

        System.out.print("Length of the end part: ");
        int length = reader.nextInt();

        System.out.print("Result: " + word.substring(word.length() - length));
    }
}
