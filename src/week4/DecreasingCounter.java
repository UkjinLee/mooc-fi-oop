package week4;

public class DecreasingCounter {
    private int value;  // instance variable that remembers the value of the counter
    private int initial;

    public DecreasingCounter(int valueAtStart) {
        value = valueAtStart;
        initial = value;
    }

    public void printValue() {
        // do not touch this!
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        // write here code to decrease counter value by one
        if (value == 0)
            return;
        value--;
    }

    // sets the value of the counter to zero
    public void reset() {
        value = 0;
    }

    // returns the counter to its initial value
    public void setInitial() {
        value = initial;
    }
}
