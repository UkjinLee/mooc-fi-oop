public class NumberStatistics {

//    EXERCISE 79.1: AMOUNT OF NUMBERS

    private int amountOfNumbers;

//     initialize the object variable amountOfNumbers
    public NumberStatistics() {
        amountOfNumbers = 0;
        sum = 0;
    }

//    adds a new number to the statistics
    public void addNumber(int number) {
        amountOfNumbers++;
        sum += number;
    }

//    tells us how many numbers have been added to the statistics
    public int amountOfNumbers() {
        return amountOfNumbers;
    }


    //        EXERCISE 79.2: SUM AND AVERAGE

    private int sum;

//    returns the sum of the added numbers (if no numbers added, the sum is 0)
    public int sum() {
        return sum;
    }

//    returns the average of the added numbers (if no numbers added, the average is 0)
    public double average() {
        return 1.0 * sum / amountOfNumbers;
    }
}
