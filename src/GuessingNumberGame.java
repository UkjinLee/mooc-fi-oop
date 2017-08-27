
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int guessMade = 0;

        while(true) {
            System.out.print("Guess a number: ");
            int guess = reader.nextInt();
            if (guess < numberDrawn)
                System.out.print("The number is greater, ");
            else if (numberDrawn < guess)
                System.out.print("The number is lesser, ");
            else
                break;

            guessMade++;
            System.out.println("guesses made: " + guessMade);
        }
        System.out.println("Congratulations, your guess is correct!");
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
