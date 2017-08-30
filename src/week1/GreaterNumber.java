package week1;

import java.util.Scanner;

//Type the first number: 5
//Type the second number: 3
//Greater number: 5
//
//Type the first number: 5
//Type the second number: 8
//Greater number: 8
//
//Type the first number: 5
//Type the second number: 5
//The numbers are equal!

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the first number: ");
        int first = reader.nextInt();

        System.out.print("Type the second number: ");
        int second = reader.nextInt();

        if (first != second)
            System.out.print("Greater number: " + Math.max(first, second));
        else
            System.out.print("The numbers are equal!");
    }
}
