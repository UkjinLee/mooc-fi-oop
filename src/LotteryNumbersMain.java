import java.util.ArrayList;

public class LotteryNumbersMain {

//    Lottery numbers:
//    3 5 10 14 15 27 37

//    Lottery numbers:
//    2 9 11 18 23 32 34

//    Note! a number can be in one set of numbers only once

    public static void main(String[] args) {
        LotteryNumbers lotteryNumbers = new LotteryNumbers();
        ArrayList<Integer> numbers = lotteryNumbers.numbers();

        System.out.println("Lottery numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("");
    }
}
