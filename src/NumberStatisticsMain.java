import java.util.Scanner;

public class NumberStatisticsMain {

    public static void main(String[] args) {

//        EXERCISE 79.1: AMOUNT OF NUMBERS
//
//        Amount: 4
//
//        NumberStatistics stats = new NumberStatistics();
//        stats.addNumber(3);
//        stats.addNumber(5);
//        stats.addNumber(1);
//        stats.addNumber(2);
//        System.out.println("Amount: " + stats.amountOfNumbers());


//        EXERCISE 79.2: SUM AND AVERAGE
//
//        Amount: 4
//        sum: 11
//        average: 2.75
//
//        NumberStatistics stats = new NumberStatistics();
//        stats.addNumber(3);
//        stats.addNumber(5);
//        stats.addNumber(1);
//        stats.addNumber(2);
//        System.out.println("Amount: " + stats.amountOfNumbers());
//        System.out.println("sum: " + stats.sum());
//        System.out.println("average: " + stats.average());


//        EXERCISE 79.3: ASKING FOR NUMBERS FROM THE USER
//
//        Type numbers:
//        4
//        2
//        5
//        4
//        -1
//        sum: 15

//        When the user gives -1, the program stops and prints the sum of the given numbers
//        (excluding the -1).
//        should not make any changes to class NumberStatistics!

//        System.out.println("Type numbers:");
//        Scanner reader = new Scanner(System.in);
//        NumberStatistics stats = new NumberStatistics();
//
//        while (true) {
//            int input = reader.nextInt();
//            if (input == -1)
//                break;
//            stats.addNumber(input);
//        }
//
//        System.out.print("sum: " + stats.sum());


//        EXERCISE 79.4: MANY SUMS
//
//        Type numbers:
//        4
//        2
//        5
//        2
//        -1
//        sum: 13
//        sum of even: 8
//        sum of odd: 5
//
//        define in your program three NumberStatistics objects.
//        The first is used to track the sum of all the numbers.
//        The second takes care of even numbers and the third the odd numbers.
//        you should not make any changes to class NumberStatistics!

        System.out.println("Type numbers:");
        Scanner reader = new Scanner(System.in);
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();

        while (true) {
            int input = reader.nextInt();
            if (input == -1)
                break;
            stats.addNumber(input);
            if (input % 2 == 0)
                even.addNumber(input);
            else
                odd.addNumber(input);
        }

        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + even.sum());
        System.out.println("sum of odd: " + odd.sum());
    }
}
