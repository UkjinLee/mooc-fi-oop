package week1;

import java.util.Scanner;

//Type a number: 2
//Number 2 is even.
//
//Type a number: 7
//Number 7 is odd.

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int number = reader.nextInt();
        String evenOrOdd = number % 2 == 0 ? "even" : "odd";
        System.out.println("Number " + number + " is " + evenOrOdd + ".");
    }
}
