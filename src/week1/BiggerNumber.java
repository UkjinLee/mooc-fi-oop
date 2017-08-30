package week1;

import java.util.Scanner;

//Type a number: 20
//Type another number: 14
//
//The bigger number of the two numbers given was: 20

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        System.out.print("Type a number: ");
        int a = reader.nextInt();

        System.out.print("Type another number: ");
        int b = reader.nextInt();

        System.out.println("The bigger number of the two numbers given was: " + Math.max(a, b));
    }
}
