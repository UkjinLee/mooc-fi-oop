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
    }
}
