//
// holds a number that can be decreased and increased
// prevents the counter from going below 0
//
public class Counter {

    // EXERCISE 84.1: MULTIPLE CONSTRUCTORS

    // creates a new counter with the given value.
    // The check is on if the parameter given to check was true.
    public Counter(int startingValue, boolean check) {

    }

    // creates a new counter with the given value. The check on the new counter should be off.
    public Counter(int startingValue) {

    }

    // creates a new counter with the starting value 0. The check is on if the parameter given to check was true.
    public Counter(boolean check) {

    }

    // creates a new counter with the starting value of 0 and with checking off.
    public Counter() {

    }

    // returns the current value of the counter
    public int value() {
        return -1;
    }

    // increases the value of the counter by one
    public void increase() {

    }

    // decreases the value of the counter by one, but not below 0 if the check is on
    public void decrease() {

    }


    // EXERCISE 84.2: ALTERNATIVE METHODS

    // increases the value by the amount of the parameter.
    // If the value of the parameter is negative, the value will not change.
    public void increase(int increaseAmount) {

    }

    // decreases the value of the counter by the amount given by the parameter, but not below 0 if the check is on.
    // If the value of the parameter is negative, the value of the counter will not change.
    public void decrease(int decreaseAmount) {

    }
}
