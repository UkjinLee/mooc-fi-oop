package week5;

public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;

    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        hours = new BoundedCounter(hoursAtBeginning, 23);
        minutes = new BoundedCounter(minutesAtBeginning, 59);
        seconds = new BoundedCounter(secondsAtBeginning, 59);
    }

    public void tick(){
        seconds.next();
        if (seconds.getValue() == 0) {
            minutes.next();
            if (minutes.getValue() == 0)
                hours.next();
        }
    }

    public String toString() {
        return hours.toString() + ":" + minutes.toString() + ":" + seconds.toString();
    }
}
