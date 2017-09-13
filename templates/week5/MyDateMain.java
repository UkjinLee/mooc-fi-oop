public class MyDateMain {

    public static void main(String[] args) {

//        EXERCISE 91.3: CREATION OF A NEW DATE

//        Friday after  1 weeks is 2.3.2011
//        Friday after  2 weeks is 9.3.2011
//        Friday after  3 weeks is 16.3.2011
//        Friday after  4 weeks is 23.3.2011
//        Friday after  5 weeks is 30.3.2011
//        Friday after  6 weeks is 7.4.2011
//        Friday after  7 weeks is 14.4.2011
//        This week's Friday is 25.2.2011
//        The date 790 days from this week's Friday is  5.5.2013

        MyDate day = new MyDate(25, 2, 2011);
        MyDate newDate = day.afterNumberOfDays(7);
        for (int i = 1; i <= 7; ++i) {
            System.out.println("Friday after  " + i + " weeks is " + newDate);
            newDate = newDate.afterNumberOfDays(7);
        }
        System.out.println("This week's Friday is " + day);
        System.out.println("The date 790 days from this week's Friday is  " + day.afterNumberOfDays(790));


//        EXERCISE 92.1: DIFFERENCE IN YEARS, FIRST VERSION

//        1.1.2011 and 24.12.2009 difference in years: 2     // since 2011-2009 = 2
//        25.12.2010 and 24.12.2009 difference in years: 1   // since 2010-2009 = 1
//        1.1.2011 and 25.12.2010 difference in years: 1     // since 2011-2010 = 1

//        week5.MyDate first = new week5.MyDate(24, 12, 2009);
//        week5.MyDate second = new week5.MyDate(1, 1, 2011);
//        week5.MyDate third = new week5.MyDate(25, 12, 2010);
//
//        System.out.println( second + " and " + first + " difference in years: " + second.differenceInYears(first) );
//        System.out.println( third + " and " + first + " difference in years: " + third.differenceInYears(first) );
//        System.out.println( second + " and " + third + " difference in years: " + second.differenceInYears(third) );


//        EXERCISE 92.2: MORE ACCURACY

//        1.1.2011 and 24.12.2009 difference in years: 1
//        25.12.2010 and 24.12.2009 difference in years: 1
//        1.1.2011 and 25.12.2010 difference in years: 0

//        week5.MyDate first = new week5.MyDate(24, 12, 2009);
//        week5.MyDate second = new week5.MyDate(1, 1, 2011);
//        week5.MyDate third = new week5.MyDate(25, 12, 2010);
//
//        System.out.println( second + " and " + first + " difference in years: " + second.differenceInYears(first) );
//        System.out.println( third + " and " + first + " difference in years: " + third.differenceInYears(first) );
//        System.out.println( second + " and " + third + " difference in years: " + second.differenceInYears(third) );


//        EXERCISE 92.3: AND THE FINAL VERSION
//
//        24.12.2009 and 1.1.2011 difference in years: 1
//        1.1.2011 and 24.12.2009 difference in years: 1
//        24.12.2009 and 25.12.2010 difference in years: 1
//        25.12.2010 and 24.12.2009 difference in years: 1
//        1.1.2011 and 25.12.2010 difference in years: 0
//        25.12.2010 and 1.1.2011 difference in years: 0
//
//        week5.MyDate first = new week5.MyDate(24, 12, 2009);
//        week5.MyDate second = new week5.MyDate(1, 1, 2011);
//        week5.MyDate third = new week5.MyDate(25, 12, 2010);
//
//        System.out.println( first + " and " + second + " difference in years: " + second.differenceInYears(first) );
//        System.out.println( second + " and " + first + " difference in years: " + first.differenceInYears(second) );
//        System.out.println( first + " and " + third + " difference in years: " + third.differenceInYears(first) );
//        System.out.println( third + " and " + first + " difference in years: " + first.differenceInYears(third) );
//        System.out.println( third + " and " + second + " difference in years: " + second.differenceInYears(third) );
//        System.out.println( second + " and " + third + " difference in years: " + third.differenceInYears(second) );
    }
}
