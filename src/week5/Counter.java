package week5;

//
// holds a number that can be decreased and increased
// prevents the counter from going below 0
//
public class Counter {

    private int value;
    private boolean check;

    // EXERCISE 84.1: MULTIPLE CONSTRUCTORS

    // creates a new counter with the given value.
    // The check is on if the parameter given to check was true.
    public Counter(int startingValue, boolean check) {
        value = startingValue;
        this.check = check;
    }

    // creates a new counter with the given value. The check on the new counter should be off.
    public Counter(int startingValue) {
        this(startingValue, false);
    }

    // creates a new counter with the starting value 0. The check is on if the parameter given to check was true.
    public Counter(boolean check) {
        this(0, check);
    }

    // creates a new counter with the starting value of 0 and with checking off.
    public Counter() {
        this(0, false);
    }

    // returns the current value of the counter
    public int value() {
        return value;
    }

    // increases the value of the counter by one
    public void increase() {
//        value++;
        increase(1);
    }

    // decreases the value of the counter by one, but not below 0 if the check is on
    public void decrease() {
//        if (check && value == 0)
//            return;
//        value--;
        decrease(1);
    }


    // EXERCISE 84.2: ALTERNATIVE METHODS

    // increases the value by the amount of the parameter.
    // If the value of the parameter is negative, the value will not change.
    public void increase(int increaseAmount) {
        if (increaseAmount < 0)
            return;
        value += increaseAmount;
    }

    // decreases the value of the counter by the amount given by the parameter, but not below 0 if the check is on.
    // If the value of the parameter is negative, the value of the counter will not change.
    public void decrease(int decreaseAmount) {
        if (decreaseAmount < 0)
            return;
        if (check && value < decreaseAmount)
            return;
        value -= decreaseAmount;
    }
}
