package week2;

import java.util.Scanner;

//    Type numbers:
//    5
//    2
//    4
//    -1
//    Thank you and see you later!

public class LoopsEndingRemembering {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");

        int sum = 0;
        int count = 0;
        int even = 0;
        while (true) {
            int input = reader.nextInt();
            if (input == -1)
                break;
            sum += input;
            count++;
            if (input % 2 == 0)
                even++;
        }

        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + count);
        System.out.println("Average: " + 1.0 * sum / count);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + (count - even));
    }
}
