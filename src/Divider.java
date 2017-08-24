import java.util.Scanner;

//Type a number: 3
//Type another number: 2
//
//Division: 3 / 2 = 1.5

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
        System.out.print("Type a number: ");
        int a = reader.nextInt();

        System.out.print("Type another number: ");
        int b = reader.nextInt();

        System.out.println("Division: " + a + " / " + b + " = " + ((double) a / b));
    }
}
