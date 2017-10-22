package week7;

import java.util.Scanner;

public class Reader {

//    EXERCISE 3.1: READER

    private Scanner scanner;

    public Reader() {
        scanner = new Scanner(System.in);
    }

    public String readString() {
        return scanner.nextLine();
    }

    public int readInteger() {
        return Integer.parseInt(scanner.nextLine());
    }
}
