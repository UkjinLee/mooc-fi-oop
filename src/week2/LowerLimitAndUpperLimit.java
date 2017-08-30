package week2;

import java.util.Scanner;

//    First: 5
//    Last: 8
//    5
//    6
//    7
//    8
//
//    First: 16
//    Last: 12

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("First: ");
        int first = reader.nextInt();
        System.out.print("Last: ");
        int last = reader.nextInt();

        for (int i = first; i <= last; i++)
            System.out.println(i);
    }
}
