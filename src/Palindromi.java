import java.util.Scanner;

//        Type a text: madam
//        The text is a palindrome!
//
//
//        Type a word: example
//        The text is not a palindrome!

public class Palindromi {

    public static boolean palindrome(String text) {
        int head = 0;
        int tail = text.length() - 1;
        while (head < tail) {
            if (text.charAt(head) != text.charAt(tail))
                return false;
            head++;
            tail--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
