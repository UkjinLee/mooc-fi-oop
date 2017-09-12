public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        // first we'll compare years
        if ( this.year < compared.year ) {
            return true;
        }

        // if the years are the same, we'll compare the months
        if ( this.year == compared.year && this.month < compared.month ) {
            return true;
        }

        // years and months the same, we'll compare the days
        if ( this.year == compared.year && this.month == compared.month &&
                this.day < compared.day ) {
            return true;
        }

        return false;
    }


//    EXERCISE 91.1: NEXT DAY

//  advances the date by one
//  assume that all the months have 30 days
    public void advance() {

    }


//    EXERCISE 91.2: ADVANCING MANY DAYS

//    advance the day by the number given as parameter
//    assume that all the months have 30 days
//    fix the method advance() by using this
    public void advance(int numberOfDays) {

    }


//    EXERCISE 91.3: CREATION OF A NEW DATE

//    do not change this object
//    assume that all the months have 30 days
    public MyDate afterNumberOfDays(int days) {
        return null;
    }
}
