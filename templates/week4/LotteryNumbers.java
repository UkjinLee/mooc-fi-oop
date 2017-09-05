import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {

    private ArrayList<Integer> numbers;

//    creates a new LotteryNumbers object, which contains the new drawn numbers
    public LotteryNumbers() {
        numbers = new ArrayList<>();
        drawNumbers();
    }

//    returns the drawn numbers of this draw
    public ArrayList<Integer> numbers() {
        return numbers;
    }

//    draws new numbers
    public void drawNumbers() {

    }

//    reveals if the number is among the drawn numbers
    public boolean containsNumber(int number) {
        
    }
}
