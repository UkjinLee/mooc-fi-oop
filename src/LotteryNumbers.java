import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class LotteryNumbers {

    private ArrayList<Integer> numbers;
    Random random;

//    creates a new LotteryNumbers object, which contains the new drawn numbers
    public LotteryNumbers() {
        numbers = new ArrayList<>();
        random = new Random();
        drawNumbers();
    }

//    returns the drawn numbers of this draw
    public ArrayList<Integer> numbers() {
        return numbers;
    }

//    draws new numbers
//    The numbers consist of 7 different numbers between 1 and 39.
    public void drawNumbers() {
        while (true) {
            int draw = random.nextInt(39) + 1;
            if (!containsNumber(draw)) {
                numbers.add(draw);
                if (numbers.size() == 7)
                    break;
            }
        }
        Collections.sort(numbers);
    }

//    reveals if the number is among the drawn numbers
    public boolean containsNumber(int number) {
        return numbers.contains(number);
    }
}
