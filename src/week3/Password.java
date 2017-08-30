package week3;

import java.util.Scanner;

//Type the password: turnip
//Wrong!
//Type the password: beetroot
//Wrong!
//Type the password: carrot
//Right!
//
//The secret is: jryy qbar!

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        while(true) {
            System.out.print("Type the password: ");
            String input = reader.nextLine();
            if (input.equals(password)) {
                System.out.println("Right!");
                break;
            }
            System.out.println("Wrong!");
        }
        System.out.println("The secret is: jryy qbar!");
    }
}
