package week4;

public class BoundedCounter {
    private int value;
    private int upperLimit;

//    EXERCISE 78.1: BOUNDEDCOUNTER

//    In the beginning the value is 0.
//    The upper bound of the value is defined by the constructor parameter.
    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
        value = 0;
    }

//    increments the value of the counter
//    If the value would be more that the upper limit, it wraps around and becomes zero.
    public void next() {
        value++;
        if (upperLimit < value)
            value = 0;
    }

//    returns a string representation of the counter value.
    public String toString() {
        String str = value + "";
        if (value < 10)
            str = "0" + str;
        return str;
    }


//    EXERCISE 78.3: THE FIRST VERSION OF THE CLOCK

    public int getValue() {
        return value;
    }


//    EXERCISE 78.4: THE SECOND VERSION OF THE CLOCK

    public void setValue(int value) {
        this.value = value;
    }
}
