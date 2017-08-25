import java.util.Scanner;

//Type a number: 5
//The number is positive.
//
//Type a number: -2
//The number is not positive.

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int number = reader.nextInt();
        System.out.println("The number is " + ((number >= 0) ? "positive" : "negative"));

        System.out.print("Type a number: ");
        number = reader.nextInt();
        System.out.println("The number is " + ((number >= 0) ? "positive" : "negative"));
    }
}
