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
        advance(1);
    }


//    EXERCISE 91.2: ADVANCING MANY DAYS

//    advance the day by the number given as parameter
//    assume that all the months have 30 days
//    fix the method advance() by using this
    public void advance(int numberOfDays) {
        day += numberOfDays;
        if (30 < day) {
            int remains = day;
            day %= 30;
            if (day == 0)
                day = 30;
            remains -= day;
            month += remains / 30;
            if (12 < month) {
                remains = month;
                month %= 12;
                if (month == 0)
                    month = 12;
                remains -= month;
                year += (remains / 12);
            }
        }
    }


//    EXERCISE 91.3: CREATION OF A NEW DATE

//    do not return this object
//    use the method advance
    public MyDate afterNumberOfDays(int days) {
        MyDate date = new MyDate(day, month, year);
        date.advance(days);
        return date;
    }


    //    EXERCISE 92.1: DIFFERENCE IN YEARS, FIRST VERSION

    //    calculates the difference in years
    public int differenceInYears(MyDate comparedDate) {
        if (year == comparedDate.year)
            return 0;
        MyDate later = this;
        MyDate before = comparedDate;
        if (earlier(comparedDate)) {
            later = comparedDate;
            before = this;
        }
        int difference = later.year - before.year;
        if (later.month < before.month)
            difference--;
        else if (later.month == before.month && later.day < before.day)
            difference--;
        return difference;
    }
}
